public class extraction {

    public static int First(int num){

        while(num >= 10){
            num = num / 10;
        }

        return num;
    }
    public static void main(String[] args) {
        int num = 1463;
        int FirstDigit = First(num);

        System.out.println("The first digit is: " + FirstDigit);
    }
}
