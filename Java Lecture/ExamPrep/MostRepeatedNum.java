

public class MostRepeatedNum {
    public static void most(int[] arr, int size){

        int num = arr[0];
        int  mostCounted = 0;
        for(int i = 0; i< size; i++){
            int count = 0;
            for (int j = 0; j < size; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(mostCounted < count){
                mostCounted = count;
                num = arr[i];
            } 
        }

        


        System.out.println("Here is the most repeated number: " + num + " in " + mostCounted + " times");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 2, 3, 3, 3, 3, 444, 2, 2, 2, 45, 90, 10, 3, 3, 3};
        int size = arr.length;
        most(arr, size);
    }
    
}
