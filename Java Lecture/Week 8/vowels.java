

public class vowels {

    public static int vowelFind(String text){
        int len = text.length();

        int count = 0;
        for(int i = 0; i < len; i++){
            char newChar = Character.toLowerCase(text.charAt(i));

            if(newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String text = "Hello there how you doing?";
        int count = vowelFind(text);
        System.out.println("There is " + count + " vowels");

    }
}
