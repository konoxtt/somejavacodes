public class SortChecker {
    public static void main(String[] args) {
        int[] x = {141, 35, 3, 42, 608, 78};
        // int[] x = {13, 23, 58, 68, 90, 120};
        // int[] x = {90, 87, 78, 43, 22, 10};
        int size = x.length, found = 0;


        for(int i = 0; i < size - 1; i++){
            if(x[i] > x[i + 1]){
                if(x[0] > x[size - 1] || x[0] > x[size - 3]){
                    found = 0;
                }else{
                    found = 1;
                    break;
                }
            } else if(x[0] < x[size - 1]){
                found = 2; // asc
            }
        }


        if(found == 2){
            System.out.println("Asc Sorted...");
        }else if (found == 1){
            System.out.println("Not Sorted...");
        }else{
            System.out.println("Des Sorted...");
        }
    }
}
