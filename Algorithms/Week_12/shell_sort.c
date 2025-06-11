#include <stdio.h>

void swap(int *x , int *y);
void print_arr(int arr[], int size);

void shellsort(int arr[], int size){
    int k = size / 2;

    while(k > 0){
        
        for(int i = k; i < size; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    swap(&arr[i], &arr[j]);
                }
            }
        }
        k = k / 2;
    }
    print_arr(arr, size);
}

int main(){
    int arr[] = {61, 189, 149, 111, 34, 2, 24, 119, 122, 3, 10};
    int size = sizeof(arr) / sizeof(arr[0]);

    shellsort(arr,size);
    return 0;
}

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