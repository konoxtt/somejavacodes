#include <stdio.h>

// this is a linear search function
// it will search for the target element in the array
// one at time and than increment to the next element
void search(int arr[], int size){
    int target = 10;

    for(int i = 0; i < size; i++){
        if(arr[i] == target){ // found the target element
            printf("Element found at index of %d", i);
            break;
        }
    }
}

int main(){
    int arr[] = {8, 9, 10, 2, 5, 6};
    int size = 6;

    search(arr, size);

    return 0;

}