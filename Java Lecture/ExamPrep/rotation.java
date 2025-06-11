public class rotation{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;

        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[k]){
                k = k + 1;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}