public class fibanonchi {
    public static void main(String[] args){
        int x = 0, y = 1, z;

        System.out.println(x);

        for(int i = 0; i < 10; i++){

            z = x + y;

            
            System.out.println(z);

            
            x = y;
            y = z;

        }
    }
}
