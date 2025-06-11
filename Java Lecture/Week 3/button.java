import java.awt.Button;
import javax.swing.JFrame;

class button{
    button(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Button b1 = new Button("SUBMIT");
        b1.setBounds(100, 50, 50, 50);
        f.add(b1);

        Button b2 = new Button("SUBMIT");
        b1.setBounds(100, 150, 50, 50);
        f.add(b2);

        f.setSize(1500, 1200);
        f.setLayout(null);
        f.setVisible(true);

        
    }

    public static void main(String[] args) {
        new button();   
    }
}