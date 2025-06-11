import java.util.Scanner;

public class circleCalc {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        circle bigCircle = new circle();

        System.out.print("Enter the raduis: ");
        System.out.println();
        double myRaduis = gets.nextDouble();

        // we have to privide the value that needs to be calculated so we pass myraduis value 
        bigCircle.raduis = myRaduis; 

        // the functions is called and the calculatation happens
        bigCircle.areaCircle(); 
        bigCircle.diameterCircle();

        gets.close();
    }
}
