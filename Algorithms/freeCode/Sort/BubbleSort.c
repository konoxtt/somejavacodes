#include <stdio.h>

void bubbleSort(int arr[], int size){
    int temp;

    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main(){
    int arr[] = {56, 34, 67, 23, 12, 45, 78, 90, 12, 34};
    int size = sizeof(arr)/sizeof(arr[0]);

    bubbleSort(arr, size);

    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }

    return 0;

}