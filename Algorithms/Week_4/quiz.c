#include <stdio.h>

void duplicateFunction(int arr[], int size){
    int check = 0, value;

    for(int i = 0; i < size - 1; i++){
        for(int j = i + 1; j < size; j++){
            if(arr[i] == arr[j]){
                check = 1;
                value = arr[j];
                break;
            }
        }
    }

    if(check == 1){
        printf("Yes, there is a duplicate which is %d", value);
    }else{
        printf("No, there is no duplicate");
    }
}


int main(){
    int arr[] = { 8, 5, 9, 7, 6, 3};
    int size = sizeof(arr) / sizeof(arr[0]);

    duplicateFunction(arr,size);

    return 0;
}