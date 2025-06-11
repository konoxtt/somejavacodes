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