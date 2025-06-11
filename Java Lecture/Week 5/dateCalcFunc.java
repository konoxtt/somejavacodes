import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class dateCalcFunc {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        System.out.println("Enter the date in the format yyyy-mm-dd");
        String Firstdate = gets.nextLine();
        System.out.println("Enter the date in the format yyyy-mm-dd");
        String Seconddate = gets.nextLine();

        LocalDate date1 = LocalDate.parse(Firstdate);
        LocalDate date2 = LocalDate.parse(Seconddate);

        long days = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println("The difference between the two dates is " + days + " days");


        gets.close();
    }
}