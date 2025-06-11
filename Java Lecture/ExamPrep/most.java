// Try doing a loopthatprints how many times that character have occurredin like the loop is out of the loop
// And thenwrite another Luke to find the smallest one

public class most{

    public static void check(String sent){

        int[] checker = new int[sent.length()];
        sent = sent.toLowerCase();
        System.out.println(sent);
        for(int i = 0; i < sent.length(); i++){
            int count = 0;
            for(int j = 0; j < sent.length(); j++){
                if(sent.charAt(i) == sent.charAt(j)){
                    count++;
                }
            }

            checker[i] = count;
        }

        int small = checker[0], index = 0;
        for(int k = 1; k < sent.length(); k++){
            if(small < checker[k]){
                small = checker[k];
                index = k;
            }
        }

        System.err.println("The least freaquncy is " + sent.charAt(index) + " Happened " + small);
    }

    public static void main(String[] args){
        String sent = "Abracadabra";
        check(sent);
    }
}