// code that converts from tl to dollar
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class exchange{
    public static void main(String[] argc){
        JFrame frame = new JFrame();

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridLayout(2, 2, 5, 5));

        JLabel label = new JLabel("Change from Lira(TL) to Dollar(USD): ", JLabel.LEFT);
        label.setBounds(80, 20, 100, 20);
        JButton button = new JButton("Change");
        JTextField money = new JTextField(10);
        
        frame.add(label);
        frame.add(money);
        frame.add(button);

        JLabel result = new JLabel("result:-- ");
        result.setBounds(80, 100, 100, 20);
        frame.add(result);

        ActionListener listen = e -> {
            String command = e.getActionCommand();

            if("Change".equals(command)){
                String mon = money.getText();


                try{
                    Double Lira = Double.parseDouble(mon);
                    Double Dollar = Lira / 38.8;
                
                    JOptionPane.showMessageDialog(frame, "The result is: " + Dollar + " USD");


                }catch (NumberFormatException ex) { // if the text field input is not a number catch it and send this message
                    result.setText("Invalid input! Please enter a number.");
                }
            }
        };



        button.addActionListener(listen);

        frame.setVisible(true);
        frame.setResizable(true);
        System.out.println("Window created it should show up...");

    }
}
