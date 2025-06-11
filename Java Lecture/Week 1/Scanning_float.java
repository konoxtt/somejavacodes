import java.util.Scanner;

public class Scanning_float {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        float num1, num2, sum;

        System.out.println("Enter the first number: ");
        num1 = gets.nextFloat();
        System.out.println("Enter the second number: ");
        num2 = gets.nextFloat();

        sum = num1 + num2;

        System.out.println("The sum is: " + sum);


        gets.close();

    }
}
