public class palindrom {

    public static String reverse(String txtString){

        int size = txtString.length();
        int first = 0;
        int last = size - 1;

        char[] txt = txtString.toCharArray();

        while(first < last){
            char temp = txt[first];
            txt[first] = txt[last];
            txt[last] = temp;

            first++;
            last--;
        }

        txtString = new String(txt);
        return txtString;
    }   

    public static void main(String[] args) {
        String txt = "A man, a plan, a canal: Panama";
        txt = txt.replaceAll("[^a-zA-z0-9]", "");
        txt = txt.toLowerCase();
        String rev = reverse(txt);
        Boolean str = rev.equals(txt);

        if(!str){
            System.out.println("Nope.");
        } else{
            System.out.println("Yepee");
        }

        System.out.println(rev);
        System.out.println(txt);


        
    }
}
