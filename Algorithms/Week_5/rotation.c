// This code finds number of rotations in a given sorted array
#include <stdio.h>
int find(int array[], int size) {

    int min_index = 0;

    for (int i = 1; i < size; i++) {
        if (array[i] < array[min_index]) {
            return i;
        }
    }
    
}
int check(int array[], int size) {
    for (int i = 1; i < size; i++) {
        if (array[i] < array[i - 1]) {
            return 0; 
        }
    }
    return 1; 
}
int main() {
    int nums[] = {5, 6, 1, 2, 3, 4};
    int size = sizeof(nums) / sizeof(nums[0]);
    if (check(nums,size)) {
        printf("rotation is 0\n");
    } else {
        int Counter = find(nums, size);
        printf("rotation is %d\n", Counter);
    }
    return 0;
}
