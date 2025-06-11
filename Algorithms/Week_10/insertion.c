#include <stdio.h>

void print_array(int arr[], int size){
    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }
}

void insert(int arr[], int size){
    
    for(int  i = 1; i < size; i++){
        int num = arr[i];
        int j = i - 1;

        while(j <= 0 &&  arr[j] > num){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = num;
        print_array(arr,size);
        printf("\n");
    }
    

    // print_array(arr,size);

}

int main(){
    int arr[] = {64, 25, 12, 22, 11};
    int size = sizeof(arr) / sizeof(arr[0]);
    insert(arr,size);
    return 0;
}