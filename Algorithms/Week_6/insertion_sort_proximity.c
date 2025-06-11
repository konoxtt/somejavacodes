#include <stdio.h>

void locate_measurement(int arr[], int size, int new_measurement, int last_measurement) {
    int i;

   
    if (size > 0 && new_measurement == last_measurement) {
        
        for (i = size; i > size - 1; i--) {
        }
        arr[size - 1] = new_measurement; 
    } else {
        for (i = 0; i < size; i++) {
            if (new_measurement < arr[i]) {
                break; 
            }
        }

        for (int j = size; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        arr[i] = new_measurement;
    }
}

void print_array(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[10];
    int size = 0; 
    int num;
    int last_measurement = -1; // Initialize with a value that won't likely match the first input



    printf("Enter up to 10 numbers:\n");

    for (int i = 0; i < 10; i++) {
        printf("Enter a number: ");
        scanf("%d", &num);
            
        
        locate_measurement(arr, size, num, last_measurement); 
        last_measurement = num; // Update the last measurement- (last_measurement is the last number entered by the user) so we can use it in the next iteration.
        size++; 

        printf("Current sorted array: ");
        print_array(arr, size);
    }

    printf("\nFinal sorted array: ");
    print_array(arr, size);

    return 0;
}