public class missing {

    public static void check(int[] arr, int size){
        int product = 1, num = 1;

        while(num < arr[size - 1]){
            Boolean found = false;
            for(int i = 0; i < size; i++){
                if(arr[i] == num){
                    found = true;
                    break;
                }
            }

            if(!found){
                product *= num;
            }
            
            num++;  
        }

        System.out.println("here: " + product);
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 7, 10};
        int size = arr.length;
        check(arr,size);
    }
}
