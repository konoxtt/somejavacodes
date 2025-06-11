import java.util.Hashtable;
import java.util.Scanner;

public class breakdown {
    public static void main(String[] args) {
        Scanner gets = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = gets.nextInt();

        int[] arr = {100, 50, 20, 10, 5, 1};
        int size = arr.length;

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        

        for(int i = 0; i < size; i++){
            int current = arr[i];
            int count = amount / arr[i];
            if(count > 0){
                ht.put(arr[i], count);
                System.out.println(arr[i] + ": " + count);
                amount = amount % arr[i];
            }
        }

        gets.close();
    }
}
