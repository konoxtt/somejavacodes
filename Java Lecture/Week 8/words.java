public class words {

    public static int wordCounter(String text){
        int len = text.length();

        int count = 1;
        for(int i = 0; i < len; i++){
            char newChar = text.charAt(i);
            
            //or you can say If(newChar == ' ')
            if(Character.isSpaceChar(newChar)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello there how you doing?";

        int count = wordCounter(text);
        System.out.println("There is " + count + " words");

    }
}
