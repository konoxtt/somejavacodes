import java.util.Scanner;

public class fact {

    public static long factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        return fact;
    }


    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = gets.nextInt();

        System.out.println("The Factorial of the given number is: " + factorial(num));

        gets.close();
    }
}
