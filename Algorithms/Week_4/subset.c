#include <stdio.h>
#include <stdbool.h> // Good practice to use boolean type you need to explore and use what you have learned.

bool isSubset(int a1[], int n, int a2[], int m) {
    for (int i = 0; i < m; i++) {
        bool found = false;
        for (int j = 0; j < n; j++) {
            if (a2[i] == a1[j]) {
                found = true;
                break; // Once found, no need to keep searching in a1 for this element
            }
        }
        if (!found) {
            return false; // If an element in a2 is not found in a1, it's not a subset
        }
    }
    return true; // If all elements in a2 were found in a1, it is a subset
}

int main() {
    int a1[] = {11, 7, 1, 13, 23, 3, 7, 3};
    int n = sizeof(a1) / sizeof(a1[0]);
    int a2[] = {11, 3, 7, 1, 7};
    int m = sizeof(a2) / sizeof(a2[0]);

    // Check if a2 is a subset of a1
    // all elements in a2 are present in a1
    // a2 is a subset of a1
    // if one element in a2 is not present in a1
    // a2 is not a subset of a1
    bool check = isSubset(a1, n, a2, m);

    if (check) {
        printf("Yes, a2 is a subset of a1.\n");
    } else {
        printf("No, a2 is not a subset of a1.\n");
    }

    return 0;
}