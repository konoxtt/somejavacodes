import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        int num, found = 0;

        System.out.println("This code finds if a given number is a prime or not.");
        System.out.print("Enter the number: ");
        num = gets.nextInt(); // Read the number from the user

        if (num < 2) found = 1;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        gets.close(); 
    }
}