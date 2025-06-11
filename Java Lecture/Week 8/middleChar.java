public class middleChar {

    // method m
    public static void Middle(String text){
        int len = text.length();

        int middle = len / 2; 

        // if it is even do this
        if(len % 2 == 0){ 
            char before = text.charAt((middle - 1));
            char after = text.charAt((middle));
            System.out.println("" + before + after);
        }else{ 
            char ch = text.charAt(middle);
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        // String text = "14569";
        String text = "children";

       Middle(text);
    }
}