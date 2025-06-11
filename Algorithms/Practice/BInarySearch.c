#include <stdio.h>

// we look in the middle number compare it with the target 
int binarySearc(int arr[], int n){
    int target = 34;

    int first = 0, last = n - 1;

    while(first <= last){
        int mid = last + (first - last) / 2;

        if(target == arr[mid]){
            printf("Element %d has been found", arr[mid]);
            return 0;
        }else if(target > arr[mid]){
            first = mid + 1;
        }else{
            last = mid - 1;
        }
    }

    printf("The requested couldn't be Found....");
    return -1;

}

int main(){
    int arr[] = {12, 34, 54, 60, 65, 73, 80};
    int size = sizeof(arr) / sizeof(arr[0]);


    binarySearc(arr, size);

    return 0;

}