#include <stdio.h>

int BinarySearch(int arr[], int size){
    int target = 54;

    int last = size - 1;
    int first = 0;


    while(first < last){
        int mid = last + (first - last) / 2;

        if(arr[mid] == target){
            printf("Element Found...");
            return mid;
        } else if(arr[mid] < target){
            first = mid + 1;
        } else{
            last = mid + 1;
        }
    }

    return -1;
}

int main(){
    int arr[] = {12, 34, 54, 60, 65, 73, 80};
    int size = sizeof(arr) / sizeof(arr[0]);

    if(BinarySearch(arr, size) == -1){
        printf("Element not Found...");
    }
    
    return 0;
}