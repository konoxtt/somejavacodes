import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleCode {
    public static void main(String[] args){
        JFrame frame = new JFrame("Product Information");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout for absolute positioning


        JLabel label = new JLabel("Product Name:", JLabel.LEFT);
        label.setBounds(80, 20, 100, 25);
        frame.add(label);

        JTextField name = new JTextField();
        name.setBounds(200, 20, 200, 20);
        frame.add(name);

        JLabel label2 = new JLabel("Product Type:", JLabel.LEFT);
        label2.setBounds(80, 60, 100, 20);
        frame.add(label2);

        JRadioButton localBtn = new JRadioButton("Local");
        localBtn.setActionCommand("Local");
        localBtn.setBounds(200, 60, 80, 20);

        JRadioButton foreignBtn = new JRadioButton("Foreign");
        foreignBtn.setActionCommand("Foreign");
        foreignBtn.setBounds(280, 60, 80, 20);

        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(localBtn);
        bGroup.add(foreignBtn);
        frame.add(localBtn);
        frame.add(foreignBtn);

        JLabel label3 = new JLabel("Quantity:", JLabel.LEFT);
        label3.setBounds(80, 100, 100, 20);
        frame.add(label3);

        JTextField quantity = new JTextField();
        quantity.setBounds(200, 100, 100, 20);
        frame.add(quantity);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(200, 140, 100, 30);


        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productName = name.getText();
                String productType = bGroup.getSelection().getActionCommand();
                String productQuantity = quantity.getText();
                JOptionPane.showMessageDialog(frame, "Product Name: " + productName + "\nType: " + productType + "\nQuantity: " + productQuantity, "Product Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        
        frame.add(saveButton);

        frame.setVisible(true);
    }
}