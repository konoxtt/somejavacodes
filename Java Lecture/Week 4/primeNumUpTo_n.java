import java.util.Scanner;

public class primeNumUpTo_n {
    public static void main(String[] args) {
        
        Scanner gets = new Scanner(System.in);
        int n, i = 2;

        

        System.out.println("This code will prime numbers upto n");
        System.out.print("Enter the n number: ");
        n = gets.nextInt();
        
        while (i <= n) {
            int found = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j){
                        continue;
                    }
                    
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.print(" " + i);
            }

            i++;
        }

        gets.close();
    }
}