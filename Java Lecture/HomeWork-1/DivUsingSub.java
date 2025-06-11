import java.util.Scanner;

public class DivUsingSub{
    public static void main(String[] args){
        Scanner gets = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the numerator: ");
        num1 = gets.nextInt();
        System.out.print("Enter the denomentor: ");
        num2 = gets.nextInt();

        // if(num1 < num2){
        //     int temp = num1;
        //     num1 = num2;
        //     num2 = temp;
        // }

        int divy = 0    ;

        do{
            num1 = num1 - num2;
            divy++;
        }while(num1 >= num2);

        System.out.println("Division is: " + divy);
        
        gets.close();
    }
}