#include <stdio.h>

void mostRepeated(int arr[], int size){
    int most = 0;
    int num;
    
    for(int i = 0; i < size; i++){
        int count = 0;
        for (int j = 0; j < size; j++){
            if(arr[i] == arr[j]){
                count++;
                num = j;
            }
        }

        if (count > most){
            most = count;
        }
    }


    if(most > 0){
        printf("The most repeated number is %d which is repeated %d times.", arr[num], most);
    } else{
        printf("no repeated numbers");
    }

}

int main(){
    int arr[] = { 2, 20, 6, 6, 5, 6, 9, 2, 6, 9, 9, 90, 6};
    int size = sizeof(arr) / sizeof(arr[0]);

    mostRepeated(arr,size);

    return 0;
}