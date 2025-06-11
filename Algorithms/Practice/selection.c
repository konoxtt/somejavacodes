#include <stdio.h>

int selection(int arr[], int n){

    for(int i = 0; i < n; i++){
        int min = i;

        for(int j = i + 1; j < n; j++){
            if(arr[j] < arr[min]){
                // this will be the smallest number
                min = j;
            }
        }

        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
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

    selection(arr,size);
    print_array(arr,size);


    return 0;
}