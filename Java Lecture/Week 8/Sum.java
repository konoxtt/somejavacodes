public class Sum {

    public static int SumOfDigits(int num){
        int sum = 0;

        while(num > 0){
           int digit = num % 10;  // to get the last digit
            sum += digit;
            num = num / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 1463;
        int sum = SumOfDigits(num);

        System.out.println("The sum of digits are: " + sum);

    }
}
