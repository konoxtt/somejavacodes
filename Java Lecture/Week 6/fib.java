import java.util.Scanner;

public class fib {

    static boolean isPrime(int num){
        if(num <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++){ 
            if(num % i == 0)
                return false;
        }

        return true;
    }

    
    public static void main(String[] args) {

        Scanner gets = new Scanner(System.in);
        // Scanner hello = new Scanner(System.in);


        int x = 0, y = 1, z;

        System.out.print("Enter the limit to look for: ");
        int num = gets.nextInt();

        int i = 2;
        
        while(i < num){  
            z = x + y;  
            if(isPrime(z)){
                System.out.print(z +" ");
            }
            
            x = y;
            y = z;
            i++;
        }

        gets.close();
    }
}
