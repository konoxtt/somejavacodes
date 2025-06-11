#include <stdio.h>
#include <stdbool.h>

void repeat(int arr[], int size) {
    int pos[size];
    int repeated[size];
    int count = 0;

    for (int i = 0; i < size; i++) {
        pos[i] = 0;
    }

    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                pos[i] = 1;
                pos[j] = 1;
            }
        }
    }

    for (int i = 0; i < size; i++) {
        if (pos[i] == 1) {
            bool found_in_repeated = false;
            for (int k = 0; k < count; k++) {
                if (arr[i] == repeated[k]) {
                    found_in_repeated = true;
                    break;
                }
            }

            if (!found_in_repeated) {
                repeated[count++] = arr[i];
            }
        }
    }

    if (count == 0) {
        printf("No repeated elements found.\n");
    } else {
        printf("Repeated elements: ");
        for (int d = 0; d < count; d++) {
            printf("%d ", repeated[d]);
        }
        printf("\n");
    }
}

int main() {
    int arr[] = {3, 5, 5, 9, 12, 12, 26, 34, 34, 41};
    int size = sizeof(arr) / sizeof(arr[0]);

    repeat(arr, size);

    return 0;
}