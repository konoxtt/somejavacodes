#include <stdio.h>

void insertion(int arr[], int size, int num){
    
    int i = size - 1;
    while(i >= 0 && arr[i] > num){
        arr[i + 1] = arr[i];
        i--;
    }

    arr[i + 1] = num;
}


void print_array(int arr[], int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}


int main(){
    int arr[10], num;
    int size = 0;

    for(int i = 0; i < size; i++){
        printf("Enter the element: ");
        scanf("%d", &num);

        insertion(arr,size,num);
        size++;
    }

    

    print_array(arr, size); 


}