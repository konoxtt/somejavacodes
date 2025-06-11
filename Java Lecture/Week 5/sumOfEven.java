public class sumOfEven {
    public static void main(String[] args) {
        
    
    int[] arr = {25, 40, 96, 35, 12, 28, 11};
    int size = 7, sum = 0;

    

    for(int i = 0; i < size; i++){
        if(arr[i] % 2 == 0){
            sum += arr[i];
        }
    }


    System.out.println("the sum is: " + sum);
}   

}
