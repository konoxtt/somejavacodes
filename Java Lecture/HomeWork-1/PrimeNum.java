public class PrimeNum {
    public static void main(String[] args) {
        int i = 1, sum = 0, count = 0;

        while( count < 100){
            if(isPrime(i) == 0){
                sum += i;
                count++;
            }

            i++;
        }

        System.out.println("The sum is: " + sum);
    }

    public static int isPrime(int i){

        if (i <= 1) { 
            return 1; 
        }
        for (int j = 2; j <= Math.sqrt(i); j++) { 
            if (i % j == 0) {
                return 1; // Not prime
            }
        }

        return 0;
    }
}
