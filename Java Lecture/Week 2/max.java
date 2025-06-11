import java.util.Scanner;

public class max {
   public static void main(String[] args) {
    Scanner gets = new Scanner(System.in);

    int num1, num2, num3;
    int maxy;

    System.out.print("Enter 1st number: ");
    num1 = gets.nextInt();
    System.out.print("Enter 2nd number: ");
    num2 = gets.nextInt();
    System.out.print("Enter 3rd number: ");
    num3 = gets.nextInt();

    if (num1 >= num2 && num1 >= num3) {
        maxy = num1;
    } else if (num2 >= num1 && num2 >= num3) {
        maxy = num2;
    } else {
        maxy = num3;
    }


    
    System.out.println(maxy+ " Is the Maximum....");

    gets.close();
   } 
}
