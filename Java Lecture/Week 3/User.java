import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class User {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Info.");
        

        String year = JOptionPane.showInputDialog(frame, "Enter the year you born: "); 
        String name = JOptionPane.showInputDialog(frame, "Enter your name");
        
        int byear = Integer.valueOf(year);
        int age = 2025 - byear;

        JOptionPane.showMessageDialog(null, "Your age is: " + age);
        
        
        System.out.println("Age: "+  age);
        System.out.println("Name: "+  name);



        



        frame.dispose();

    }
}
