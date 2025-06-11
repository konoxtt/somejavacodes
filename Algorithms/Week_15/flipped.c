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

void flipped(int arr[], int size){
    int first = 0; 
    int last = size - 1;

    while(first < last){
        swap(&arr[first], &arr[last]);
        first++;
        last--;
    }

    print_arr(arr, size);
}

int main(){
    int arr[] = {25, 12, 73, 46, 18};
    int size = sizeof(arr) / sizeof(arr[0]);

    flipped(arr, size);
    return 0;
}