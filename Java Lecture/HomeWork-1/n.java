import java.util.Scanner;

public class n{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        int nn = n * 10 + n;
        int nnn = n * 100 + n * 10 + n;
        int sum = n + nn + nnn;

        System.out.println("The result is: " + sum);

        scanner.close();
    }
}