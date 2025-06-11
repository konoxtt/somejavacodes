import java.util.Scanner;

public class add_to_binary {    
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        

        System.out.println("Enter the two numbers: ");
        String num1 = gets.nextLine();
        String num2 = gets.nextLine();

         // we are changing the string into int value
        int n1 = Integer.parseInt(num1, 2);
        int n2 = Integer.parseInt(num2, 2);
        
        //add the two numbers and than chacnge it using the binary function
        int sum = n1 + n2;
        

        System.out.println("the sum is: " + Integer.toBinaryString(sum));

        gets.close();

    }
    
}
