import static java.lang.Math.PI;
import java.util.Scanner; // importing to get the closest PI value

public class area {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        int radius;  

        System.out.println("Enter the radius: ");  
        radius = gets.nextInt(); 

        // Use a double for the area to handle the floating-point result.
        double area;


        // you can also use 3.14 or 22/7 instead of PI....

        area = PI * (radius * radius);  // PI is already a double, so the result will be double.

        System.out.println("The result is: " + area);

        gets.close();
    }
}
