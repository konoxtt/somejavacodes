import java.util.Scanner;

public class BinarytoDec {
    public static void main(String[] args) {

        Scanner gets = new Scanner(System.in);
        int binary;
        System.out.print("Enter the binary number: ");
        binary = gets.nextInt();

        int num = 0, place = 1;


        while(binary > 0){
            int rem = binary % 10;
            num = num + rem * place; 
            binary = binary / 10;
            place *= 2;
        }

        System.out.println("The number in decimal is: " + num);

        gets.close();

    }
}
