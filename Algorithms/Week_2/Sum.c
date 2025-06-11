// Week 2: Programming Assignment 1
// Find all subarrays in an array that sum to a target value 
// time complexity: O(n^2)


#include <stdio.h>

void Check(int arr[], int size, int target){
    int i, j;

    int sum = 0, found = 0;

    // Loop through the array
    for (i = 0; i < size; i++){
        sum = arr[i]; 

        // Loop through the array starting from the next element
        for (j = i + 1; j < size; j++){
            sum = sum + arr[j]; // Add the current element to the sum

            if(sum == target){
                printf("Sum found between indexes %d and %d\n", i, j); // Print the position of the subarray
                found = 1;
            } 
            
            if (sum >= target){
                break; // Break the j loop 
            }
        }
    }

    if(found == 0){
        printf("Sum not found\n");
    }
}


int main(){
    int arr[] = {1, 2, 3, 4, 5};
    int size = 5;

    int target;
    printf("Enter the targeted sum: "); 
    scanf("%d", &target);

    Check(arr, size, target);

    return 0;
}

