public class emirFin {
    public static void main(String[] args) {
        int a,b=0,c=1;
        for (int i = 0; i < 10; i++) {
            a=b+c;
            System.out.println(b);
            c=b;
            b=a;
            
        }
    }
}
