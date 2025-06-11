#include <stdio.h>

void removeDuplicate(int arr[], int n){
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(arr[i] == arr[j]){
                printf("Duplicate found: %d\n", arr[j]);
                arr[j] = arr[n-1];
                n--;
                j--;
            }
        }
    }

    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
}


int main(){
    int arr[] = {3, 43, 21, 44, 213, 11, 43, 100};
    int n = sizeof(arr)/sizeof(arr[0]);

    removeDuplicate(arr, n);

    return 0;

}