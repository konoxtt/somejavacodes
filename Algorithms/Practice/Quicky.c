#include <stdio.h>

void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}

int partition(int arr[], int low, int high){
    int pivot = arr[high];

    int i = low - 1;

    for(int j = low; j <= high - 1; j++){
        if(arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }


    swap(&arr[i + 1], &arr[high]); // swap the value of the pivot in the middle to the current location of i
    return i + 1; // return the postion of the pivot
}

int quickSort(int arr[], int low, int high){

    if(low < high){
        int pivot = partition(arr, low, high);
        quickSort(arr,low,pivot - 1);
        quickSort(arr,pivot + 1, high);

    }
}

void print_array(int arr[], int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}


int main(){
    int arr[] = {54, 12, 65, 80, 34, 73, 60};
    int size = sizeof(arr) / sizeof(arr[0]);

    quickSort(arr, 0, size - 1);
    print_array(arr,size);
    return 0;
}