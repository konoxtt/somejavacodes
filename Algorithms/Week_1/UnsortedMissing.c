#include <stdio.h>

void missingNum(int arr[] , int size){
    int counter = 1, found = 0;
    
    // loop through the array
    for(int i = 0; i <= size; i++)
    {
        found = 0;

        // check if the counter is in the array
        for (int k = 0; k <= size; k++){

            if (counter == arr[k]){
                found = 1;
                break;
            }
        }
        
            if (found == 0) break; // break out of the loop if the number is not found in the array

            counter++; // add 1 to counter
        
    }


   if(found == 0){
        printf("The missing number is %d\n", counter);
    } else {
        printf("Nothing\n");
   }
    
    
}

int main(){
    int arr[] = {6, 1, 2, 8, 5, 3, 9, 7, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    missingNum(arr, size);

    return 0;

    
}