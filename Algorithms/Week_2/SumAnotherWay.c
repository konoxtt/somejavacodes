// Week 2: Programming Assignment 1
// Find all subarrays in an array that sum to a target value 
// Another way to solve the problem
// time complexity: O(n^3)

#include <stdio.h>

void Check(int arr[], int size, int target) {
    int i, j, sum;
    int found = 0;

    for (i = 0; i < size; i++) {
        for (j = i; j < size; j++) {
            sum = 0;

            // Calculate the sum of the elements between i and j (inclusive)
            for (int k = i; k <= j; k++) {
                sum += arr[k]; // Add the element to the sum to equate to the target
            }

            
            if (sum == target) {
                printf("Sum found between indexes %d and %d: ", i, j);
                for (int k = i; k <= j; k++) {
                    printf("%d ", k); // Print the position of the subarray
                }
                printf("\n");
                found = 1;
            } else if (sum > target || target == arr[j]) {
                break; // If the sum exceeds the target, break the loop
            }
        }
    }

    if (!found) {
        printf("No such subset found\n"); // If no subset is found, print this message
    }
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int size = sizeof(arr) / sizeof(arr[0]);

    int target;
    printf("Enter the targeted sum: ");
    scanf("%d", &target);

    printf("Subarrays that sum to %d:\n", target);
    Check(arr, size, target);

    return 0;
}