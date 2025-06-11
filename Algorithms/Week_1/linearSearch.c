// this kind of algorithm is very suitable in unsorted small arrays, for instance if the array is very huge and sorted it will be ridicolous
// to use this kind of searching so we use
// other types of algorthims... O(N)....


#include <stdio.h>

int main(){ 
    int arr[] = {10, 47, 64, 70, 40, 100, 20, 30};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("%d" , size);
    
    int key, check = 0;
    printf("\nEnter the key number: ");
    scanf("%d", &key);

    for(int i = 0; i < size; i++){
        if(arr[i] == key){
            printf("Found\n");
            return 0;
        } 
    }


    
    printf("Not found....\n");


    return 0;
}