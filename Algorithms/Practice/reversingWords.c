#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void reverse(char sent[]){
    int size = strlen(sent);

    int j = 0;

    for(int i = 0; i < size + 1; i++){

        // the q
        // j  i
        // 

        if(sent[i] == ' ' || sent[i] == '\0'){
            int end = i - 1;
            while(j < end){
                char temp = sent[j];
                sent[j] = sent[end];
                sent[end] = temp;
                j++;
                end--;
            }

            j = i + 1;
        }
    }

    printf("%s\n", sent);
}

int main(){
    char sent[30] = "the quick brown fox";
    sent[strcspn(sent, "\n")] = 0;
    reverse(sent);
    return 0;
}