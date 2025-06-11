import javax.swing.*;

public class SwingExample1 {
    public static void main(String[] args) {
        //Declare JFrame object
        JFrame frame = new JFrame();

        //Set the title
        frame.setTitle("Java Swing Example-1");

        //Set the frame size
        frame.setSize(350, 150);

        //Disable the resize option
        frame.setResizable(false);


        //Set frame position to the center of the screen
        frame.setLocationRelativeTo(null);

        //Make the frame visible
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Window created it should show up...");

    }
}
