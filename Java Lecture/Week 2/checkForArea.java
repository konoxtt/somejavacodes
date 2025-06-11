import java.util.Scanner;
import static java.lang.Math.PI; // importing to get the closest PI value

public class checkForArea {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        int radius;  

        System.out.print("Enter the radius: ");  
        radius = gets.nextInt();

        double area;



        if(radius > 50){
            System.out.println("\n\t\tError!!\n the number should be less than 50");
        } else{
            area = PI * (radius * radius); 
            System.out.println("The result is: " + area);
        }



        gets.close();
    }
}
