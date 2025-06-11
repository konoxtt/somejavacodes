import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        double n, i = 0.0, sum = 0.0;

        System.out.println("This code will sum up the number from 1 to n but they are all odd");
        System.out.print("Enter the number: ");
        n = gets.nextInt();

        while(i <= n){
            if(i % 2 != 0){
                sum = sum + i;
            }
            i++;
        }


        System.out.println("The sum is: " + sum); // Output the sum

        gets.close();
    }
}
