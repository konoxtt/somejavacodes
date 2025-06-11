public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {25, 40, 96, 35, 12, 28, 11};
        int size = arr.length, max = arr[0], sum = 0;

    

        // finding the max of the array
        for(int i = 1; i < 7; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int[] sumDiff = new int[size];

         // subbing from the max
        for(int j = 0; j < size; j++){
            sumDiff[j] = max - arr[j];
            sum += sumDiff[j];
        }

        

        for(int i = 0; i < size; i++){
            System.out.print(" " + sumDiff[i]);
        }

        System.out.println("\nThe sum is: " + sum);
    }
}
