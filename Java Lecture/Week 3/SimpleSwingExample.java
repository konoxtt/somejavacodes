import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleSwingExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,600); // Set window size
        frame.setLayout(new FlowLayout()); // Use FlowLayout for simple arrangement

        // Create a JLabel (text label)
        JLabel label = new JLabel("Click the button!");
        frame.add(label);

        // Create a JButton (button)
        JButton button = new JButton("Click Me");
        frame.add(button);
        

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}