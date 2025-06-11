import java.util.Scanner;

public class dateCalc {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);

        System.out.println("Enter the date in the format dd-mm-yyyy");
        int d1 = gets.nextInt();
        int m1 = gets.nextInt();
        int y1 = gets.nextInt();

        System.out.println("Enter the date in the format dd-mm-yyyy");
        int d2 = gets.nextInt();
        int m2 = gets.nextInt();
        int y2 = gets.nextInt();

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};


        int days;
        int days1 = 0;

        for (int i = 0; i < y1; i++) {
            if (i % 4 == 0) {
                days1 += 366;
            } else {
                days1 += 365;
            }
        }

        System.out.println("Days1: " + days1);

        for (int i = 0; i < m1 - 1; i++) {
            days1 += daysInMonth[i];
        }

        days1 += d1;

        System.out.println("Days1: " + days1);


        int days2 = 0;

        for (int i = 0; i < y2; i++) {
            if (i % 4 == 0) {
                days2 += 366;
            } else {
                days2 += 365;
            }
        }

        for (int i = 0; i < m2 - 1; i++) {
            days2 += daysInMonth[i];
        }

        days2 += d2;

        days = days2 - days1;

        System.out.println("The difference between the two dates is " + days + " days");

    gets.close();


    }

    
}
