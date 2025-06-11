import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = gets.nextInt();

        if(isPrime(num)){
            System.out.println("It is a prime number...");
        }else{
            System.out.println("It is not prime number....");
        }


        gets.close();

    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
