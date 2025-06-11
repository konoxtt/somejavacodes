#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Function to swap two integers
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Function to convert 2D index to 1D index
int get_index(int row, int col) {
    return row * 100 + col;
}

// Function to convert 1D index to 2D row
int get_row(int index) {
    return index / 100;
}

// Function to convert 1D index to 2D column
int get_col(int index) {
    return index % 100;
}

// Insertion Sort for the matrix
void insertionSortMatrix(int matrix[100][100]) {
    int i, j;
    for (i = 1; i < 10000; i++) {
        int key = matrix[get_row(i)][get_col(i)];
        j = i - 1;
        while (j >= 0 && matrix[get_row(j)][get_col(j)] > key) {
            matrix[get_row(j + 1)][get_col(j + 1)] = matrix[get_row(j)][get_col(j)];
            j--;
        }
        matrix[get_row(j + 1)][get_col(j + 1)] = key;
    }
}

// Selection Sort for the matrix
void selectionSortMatrix(int matrix[100][100]) {
    int i, j, min_index;
    for (i = 0; i < 10000 - 1; i++) {
        min_index = i;
        for (j = i + 1; j < 10000; j++) {
            if (matrix[get_row(j)][get_col(j)] < matrix[get_row(min_index)][get_col(min_index)]) {
                min_index = j;
            }
        }
        if (min_index != i) {
            swap(&matrix[get_row(i)][get_col(i)], &matrix[get_row(min_index)][get_col(min_index)]);
        }
    }
}

// Bubble Sort for the matrix
void bubbleSortMatrix(int matrix[100][100]) {
    int i, j;
    for (i = 0; i < 10000 - 1; i++) {
        for (j = 0; j < 10000 - i - 1; j++) {
            if (matrix[get_row(j)][get_col(j)] > matrix[get_row(j + 1)][get_col(j + 1)]) {
                swap(&matrix[get_row(j)][get_col(j)], &matrix[get_row(j + 1)][get_col(j + 1)]);
            }
        }
    }
}


int main() {
    int originalMatrix[100][100];
    int matrixToSort[100][100];
    clock_t start_time, end_time;
    double duration;
    int i, j;

    // Seed the random number generator
    srand(time(NULL));

    // Fill the original matrix with random integers
    printf("Generating Random Matrix...\n");
    for (i = 0; i < 100; i++) {
        for (j = 0; j < 100; j++) {
            originalMatrix[i][j] = rand() % 1000; // Generate random numbers between 0 and 999
        }
    }

    // --- Bubble Sort ---
    // Copy the original matrix to the matrix to be sorted
    for (i = 0; i < 100; i++) {
        for (j = 0; j < 100; j++) {
            matrixToSort[i][j] = originalMatrix[i][j];
        }
    }
    printf("Sorting with Bubble Sort...\n");
    start_time = clock();
    bubbleSortMatrix(matrixToSort);
    end_time = clock();
    duration = (double)(end_time - start_time) / CLOCKS_PER_SEC;
    printf("Bubble Sort Execution Time: %f seconds\n\n", duration);

    // --- Insertion Sort ---
    // Copy the original matrix
    for (i = 0; i < 100; i++) {
        for (j = 0; j < 100; j++) {
            matrixToSort[i][j] = originalMatrix[i][j];
        }
    }
    printf("Sorting with Insertion Sort...\n");
    start_time = clock();
    insertionSortMatrix(matrixToSort);
    end_time = clock();
    duration = (double)(end_time - start_time) / CLOCKS_PER_SEC;
    printf("Insertion Sort Execution Time: %f seconds\n\n", duration);

    // --- Selection Sort ---
    // Copy the original matrix
    for (i = 0; i < 100; i++) {
        for (j = 0; j < 100; j++) {
            matrixToSort[i][j] = originalMatrix[i][j];
        }
    }
    printf("Sorting with Selection Sort...\n");
    start_time = clock();
    selectionSortMatrix(matrixToSort);
    end_time = clock();
    duration = (double)(end_time - start_time) / CLOCKS_PER_SEC;
    printf("Selection Sort Execution Time: %f seconds\n\n", duration);

    return 0;
}