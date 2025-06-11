import java.util.Scanner;;

public class userInfo {
    public static void main(String[] args) {
        String name;
        int year, age;
        Scanner gets = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = gets.nextLine();

        System.out.print("Enter the year you were born: ");
        year = gets.nextInt();

        age = 2025 - year;

        System.out.println("Name: " + name + "\tAge: " + age + " years old");


        gets.close();
    }
}
