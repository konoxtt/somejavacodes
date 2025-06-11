#include <stdio.h>

int binarySearch(int arr[], int size){

    int target;
    printf("Enter the target: ");
    scanf("%d", &target);


    int last = size - 1;
    int first = 0;

    while(first <= last){
        int mid = first + (first - last) / 2;

        if(arr[mid] == target){
            printf("Element found at index %d\n", mid);
            return mid;
        }
        else if(arr[mid] < target){
            first = mid + 1;
    }else{
        last = mid - 1;
    }

    return -1;
}

}


int main(){
    int arr[] = {45, 67, 89, 123, 567, 678, 890, 987, 1000};
    int size = sizeof(arr)/sizeof(arr[0]);


    if(binarySearch(arr, size) == -1){
        printf("Element not found\n");
    }

    return 0;
    
}