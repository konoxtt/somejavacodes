#include <stdio.h>

void perfect(int num){
    int sum = 0;
    
    for(int i = 1; i < num; i++){
        if(num % i == 0){
            sum = sum + i;
        }
    }

    if(sum == num){
        printf("The number is perfect");
    } else{
        printf("The number is not perfect....  :(");
    }
}

int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);

    perfect(num);
    return 0;
}