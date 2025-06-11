import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        double average = calculateAveragePrime(start, end);

        if (average == 0) {
            System.out.println("No prime numbers found between " + start + " and " + end + ".");
        } else {
            System.out.println("Average of prime numbers between " + start + " and " + end + ": " + average);
        }
    }

    public static double calculateAveragePrime(int start, int end) {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}