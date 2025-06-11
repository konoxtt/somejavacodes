#include <stdio.h>

void swap(int *x , int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

void print_arr(int arr[], int size){
    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }

    printf("\n");
}

int pivotFinder(int arr[], int start, int end){

    // made it the last element
    int pivot = arr[end]; 


    int i = start - 1;

    for(int j = start; j < end; j++){
        if(arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }

    swap(&arr[i + 1], &arr[end]);
    return i + 1;
}

int quicksort(int arr[], int start, int end){

    if(start < end){
        int pivot = pivotFinder(arr, start, end);
        quicksort(arr, 0, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }   
}

int main(){
    int arr[] = {61, 189, 149, 111, 34, 2, 24, 119, 122, 3, 10};
    int size = sizeof(arr) / sizeof(arr[0]);

    quicksort(arr, 0, size - 1);
    print_arr(arr,size);
    return 0;
}


//   0       p   
//   4 5 2 1 3 6 9 10
//                  j
//           i



//  0   p
//  2 1 3 4 5
//          j 
//    i


//   1 2
//     j 
//   i