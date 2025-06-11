#include <stdio.h>

void similarity(int arr1[], int size1, int arr2[], int size2, int arr3[], int size3){
    
    int num[10];  // you can also use malloc if needed
    int place = 0;
    
    // checking the first and second array
    for(int i = 0; i < size1; i++){
        for(int j = 0; j < size2; j++){
            if(arr1[i] == arr2[j]){
                num[place++] = arr2[j];
            }
        }
    }



    int found = 0, i = 0;
   
    // check if the found similarities are also found in the third array
    while(i < place){
        found = 0;
        for(int j = 0; j < size3; j++){
            if(num[i] == arr3[j]){
                found = 1;
            }
        }

        // if not found in the remove the element
        if(found == 0){
            for(int k = i; k < place; k++){
                num[k] == num[k + 1];
                place--;
                i--;
            }
        } else{
            i++;
        }
    }

    
        // print the similarities as an array and it will print nothing if so...
        printf("The similar numbers are: ");
        for(int i = 0; i < place; i++){
        printf("%d ", num[i]);
    }
}


int main(){
    int arr1[] = {1, 5, 10, 20, 80, 1000, 160};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int arr2[] = {6, 7, 20, 80, 100, 160};
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    int arr3[] = {3, 4, 15, 20, 30, 70, 80, 160};
    int size3 = sizeof(arr3) / sizeof(arr3[0]);

    similarity(arr1, size1, arr2, size2, arr3, size3);

    return 0;
}