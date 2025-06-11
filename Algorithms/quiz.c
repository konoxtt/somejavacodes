// Bedri Jama

#include <stdio.h>

void print_array(int arr[], int size){
    for(int i = 0; i < size; i++){
        printf("%d ", arr[i]);
    }
}

void swap(int *x, int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}


// simple select sort
void select(int arr[], int size){
    int min = 0;
    for(int i = 0; i < size; i++){
        min = i;
        for(int j = i + 1; j < size; j++){
            if(arr[j] < arr[min]){
                min = j;
            }
        }
         swap(&arr[i], &arr[min]); 
    }

    print_array(arr,size);
    printf("\n"); // new line so you can see the rows.
}



int main(){
    int matrix[4][4] = {{5, 8, 4, 2},
                        {6, 1, 9, 3,},
                        {3, 7, 4, 8},
                        {4, 1, 9, 6}};
    

    // for every row, and we have 4 rows so we sort for each row
    for(int i = 0; i < 4; i++){
        select(matrix[i], 4);
    }                                      
    return 0;  
}