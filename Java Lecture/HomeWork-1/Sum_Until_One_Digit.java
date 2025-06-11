import java.util.Scanner;

public class Sum_Until_One_Digit {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        int num;
        System.out.print("Enter the number: ");
        num = gets.nextInt();

        int sum = num;

        while(num >= 10){
            sum += num;
            num /= 10;
        }


        System.out.println("The sum is: " + sum);

        gets.close();
    }
}
