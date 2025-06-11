

#include <stdio.h>

void locate(int arr[], int index, int newElement){
    int i = index - 1;

   
    while (i >= 0 && arr[i] > newElement) {
        arr[i + 1] = arr[i];
        i--;
    }

    arr[i + 1] = newElement;
}

void print_array(int arr[], int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}

int main(){
    int arr[10], num;
    int index = 0;

    printf("Enter 10 numbers to sort: \n");
    printf("The numbers will be sorted as you enter them\n");

    for(int i = 0; i < 10; i++){
        printf("Enter %d number: ", i + 1);
        scanf("%d", &num);
        
        locate(arr, index, num);
        index++; 
    }

    print_array(arr, index);
    
    return 0;
}