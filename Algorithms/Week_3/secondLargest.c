#include <stdio.h>

void Max(int arr[], int size){
    int max = arr[0] ;
    int secondMax = arr[0];

    for (int i = 1; i < size; i++){
        if(max < arr[i]){
            secondMax = max;
            max = arr[i];
        } else if(secondMax < arr[i] && max > arr[i]){
            secondMax = arr[i];
        }
    }


    printf("The second max is %d" , secondMax);
}

int main(){
    int arr[] = {113, 3, 122, 100, 20, 111, 112};
    int size = sizeof(arr) / sizeof(arr[0]);

    Max(arr,size);

    return 0;
}