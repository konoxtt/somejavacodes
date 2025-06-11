#include <stdio.h>

void check(int arr[], int size, int target){


    for(int i = 0; i < size - 1; i++){
        for(int j = 0; j < size - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("The sorted array is: ");
    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    printf("The smallest pair is: %d ", arr[0]);
    
}

int main(){
    int arr[] = {11, 3, 17, 1, 7};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target;

    printf("Enter the target: ");
    scanf("%d", &target);

    check(arr,size, target);

    return 0;
}