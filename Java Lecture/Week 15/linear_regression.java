import java.util.Scanner;

public class linear_regression{
    public static void main(String[] args){
        Scanner gets = new Scanner(System.in);
        
        double[] x_income = {200.0, 300.0, 400.0, 450.0, 520.0};
        double[] y_holiday = {30.0, 40.0, 50.0, 55.0, 60.0};
        int n = x_income.length; 

        double sumX = 0.0;
        double sumY = 0.0;
        double sumXY = 0.0;   
        double sumX2 = 0.0;   

        
        for (int i = 0; i < n; i++) {
            sumX += x_income[i];
            sumY += y_holiday[i];
            sumXY += x_income[i] * y_holiday[i];
            sumX2 += x_income[i] * x_income[i];
        }
       

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        System.out.print("Enter the number you want to predict: ");
        double predictionX = gets.nextInt();
        double predictionY = a + b * predictionX;

        System.out.printf("Predicted value for %.2f is: %.2f%n", predictionX, predictionY);
        gets.close();
    }
}