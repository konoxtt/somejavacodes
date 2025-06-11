#include <stdio.h>

void check(int arr[], int size, int target){
    int i, element;

    for (i = 0; i < size; i++){

        if(i == target){
            printf("%d smallest is %d", target, arr[i]);
        }
    }
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