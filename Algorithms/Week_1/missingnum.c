#include <stdio.h>

int missingNum(int arr[] , int size){
    int j = 1;

    for(int i = 0; i < size; i++)
    {
        if(j != arr[i]){
            return j;
        } else j++;
    }

    return -1;
}

int main(){
    int arr[] = {1 , 2, 3, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    int missing = missingNum(arr, size);

    if(missing == -1){
        printf("Nothing");
    } else {
        printf("the missing number is %d\n", missing);
    }

    return 0;

    
}