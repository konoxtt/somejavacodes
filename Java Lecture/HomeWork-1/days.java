import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the date YMD: ");
        int y = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        s.close();

        int[] dm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (l(y)) dm[1] = 29;
        int dc = d;
        for (int i = 0; i < m - 1; i++) dc += dm[i];
        System.out.println("Number of days from the beginning of the year: " + dc);

        s.close();
    }
    public static boolean l(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}