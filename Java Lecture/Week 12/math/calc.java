import java.util.Scanner;
// no need to import the other file if it's in the same folder 



public class calc{
    public static void main(String[] args) {
        math hello = new math();
        Scanner gets = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = gets.nextInt();
        System.out.print("Enter the first number: ");
        int second = gets.nextInt();

        hello.a = first;
        hello.b = second;
        System.out.println("The sum is: " + hello.sum());
        System.out.println("The difference is: " + hello.sub());
        System.out.println("The product is: " + hello.mult());
        System.out.println("The division is: " + hello.div());
        

        gets.close();

    }
}