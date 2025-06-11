import java.util.Scanner;

public class fibPos {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        System.out.print("Enter the position you are looking for: ");
        int target = gets.nextInt();

        int x = 0, y = 1, z;
        int i = 0;

        while (i <= target) {

            if (i == target) {
                System.out.println("The Fibonacci number at position " + i + " is: " + x);
                break;
            }

            z = x + y;
            x = y;
            y = z;
            i++;
        }

        if(i > target){
            System.out.println(target + " was not found.");
        }

        gets.close();
    }
}