import java.util.Scanner;

public class mid_digit {
    public static void main(String[] args){
        Scanner gets = new Scanner(System.in);
        int num;
        System.out.print("Enter the number with 5 digits: ");
        num = gets.nextInt();

        int midnum= (num / 100) % 10;

        System.out.println("The number is: " + midnum);

        gets.close();
    }
}
