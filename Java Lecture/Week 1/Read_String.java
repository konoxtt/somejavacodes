import java.util.Scanner;

public class Read_String {  
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        

        System.out.print("Enter your name: ");

        String name = gets.nextLine();

        System.out.println("The name entered is: " + name);

        gets.close();

    }
    
}
