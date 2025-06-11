#include <stdio.h>


void sorting(int matrix[][3], int rows, int cols) {
    int i, j, k, temp;
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols - 1; j++) {    
            for (k = j + 1; k < cols; k++) {
                if (matrix[i][j] > matrix[i][k]) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = temp;
                }
            }
        }
    }

    // Print the sorted matrix
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int matrix[3][3] = {
        {9, 2, 5},
        {1, 4, 8},
        {7, 6, 3}
    };


    sorting(matrix, 3, 3);

    return 0;
}