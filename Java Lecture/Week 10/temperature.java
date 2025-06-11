import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class temperature{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        // basic frame setup for the program 
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        
       
        // new flowlayout arranges frames in a row, like words on a line.
        frame.setLayout(new FlowLayout()); 

        JLabel label = new JLabel("Enter the temperature");
        JButton button_cToF = new JButton("Celsuis");
        JTextField input_cToF = new JTextField(20);

        JLabel result = new JLabel("Result:-- ");

        ActionListener calculater = e -> {
            String command = e.getActionCommand();

            if("Celsuis".equals(command)){
                String input = input_cToF.getText();

                try {
                    Double cels = Double.parseDouble(input);
                    Double fahr = (cels * 1.8) + 32;

                    result.setText("The fahrenheit is " + fahr);
                } catch (NumberFormatException ex) { // if the text field input is not a number catch it and send this message
                    result.setText("Invalid input! Please enter a number.");
                }
            }
        };


        button_cToF.addActionListener(calculater); // make this button fuctionable

        // adding the J- elements into our contianer
        frame.add(label);
        frame.add(button_cToF);
        frame.add(input_cToF);
        frame.add(result);

        frame.setResizable(true);
        frame.setVisible(true);
        
    }
}