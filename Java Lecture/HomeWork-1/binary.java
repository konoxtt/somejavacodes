import java.util.Scanner;

public class binary {
    public static void main(String[] args){
        Scanner gets = new Scanner(System.in);

        int num;
        System.out.print("Enter the number: ");
        num = gets.nextInt();

        int place = 1, binary = 0;

        while(num>0){
            int rem = num % 2;
            binary = binary + rem*place;
            place*=10;
            num = num / 2;
        }

        System.out.println("Binary number is: " + binary);

        gets.close();
    }
}
