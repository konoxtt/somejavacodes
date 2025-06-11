#include <stdio.h>

int foundbig(int arr[], int N) {
    int big = arr[0];
    for (int i = 0; i < N; i++) {
        if (arr[i] > big) {
            big = arr[i];
        }
    }
    return big;
}

int foundmin(int arr[] , int size) {
    int min = arr[0];
    for (int i = 0; i < size; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

int sumArray(int ________, int ________) {
    int sum = 0;
    for (int i = 0; i < N; i++) {
        sum += ________;
    }
    return sum;
}

int main() {
    int N = 9;
    int array[9] = {20, 22, 23, 24, 25, 26, 27, 28, 29};

    int max = foundbig(array, N);
    int min = foundmin(array, N);
    int totalArray = sumArray(________, ________);

    int sumControl = 0;
    for (int i = min; i <= max; i++) {
        sumControl += i;
    }

    int missingValue = sumControl - totalArray;
    printf("Missing value: %d\n", missingValue);

    return 0;
}