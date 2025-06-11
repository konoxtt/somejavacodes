#include <stdio.h>

void swap(int *x, int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

void select(int arr[], int size){
    int min;

    for(int i = 0; i < size; i++){
        
        //finding the minimum element location
        
        min = i;
        for(int j = i + 1; j < size; j++){
            if(arr[j] < arr[min]){
                min = j;
            }
        }
        
        swap(&arr[min], &arr[i]);
        
    }
}



void print_array(int arr[], int size){
    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }
}

int main(){
    int arr[] = {64, 25, 12, 22, 11};
    int size = sizeof(arr) / sizeof(arr[0]);

    select(arr, size);
    print_array(arr, size);

    return 0;
}