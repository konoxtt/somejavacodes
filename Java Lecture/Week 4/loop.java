import java.util.Scanner;

public class loop {
    public static void main(String[] args) { // Added main method
        Scanner gets = new Scanner(System.in);
        long i = 1, n, sum = 0; // you can use long or double if the number(n) is big.

        System.out.println("This will sum up the number between 1 to n");
        System.out.print("Entered the number: ");
        n = gets.nextInt();

        if(n < 0){System.out.println("Error Happened!!");}

        while(i <= n){
            sum = sum + i;
            i++;
        }

        System.out.println("The sum is: " + sum); // Output the sum

        gets.close();
    }
}