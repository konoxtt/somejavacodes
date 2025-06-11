import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);


        int num1, num2, sum;

        System.out.println("Enter the first number: ");
        num1 = gets.nextInt();
        System.out.println("Enter the second number: ");
        num2 = gets.nextInt();

        sum = num1 + num2;

        System.out.println("The sum is: " + sum);


        gets.close();

    }
}
