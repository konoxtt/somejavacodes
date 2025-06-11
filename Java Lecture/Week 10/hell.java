import java.awt.event.ActionListener;
import javax.swing.*;

public class hell {
    public static void main(String[] args) {
        //Declare JFrame object
        JFrame frame = new JFrame("New Component.");

        frame.setTitle("Java Swing Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        

        JLabel label = new JLabel("Hello, Swing");
        JButton button = new JButton("Click Me");
        JButton button22 = new JButton("Clic");


        JLabel label2 = new JLabel("Second one");
        JButton button2 = new JButton("Second Button");


        ActionListener buttonsListener = e -> {

            String command = e.getActionCommand();
            
            if("Click Me".equals(command)){
                Func(label, command);
            }else if ("Second Button".equals(command)){
                System.out.println("Another Button was clicked");
                label.setText("Another Button was clicked");
                System.out.println("Button clicked! Action Command: " + command);
            }else{
                System.out.println("glksnrg gsrg");
            }
        };
        
        button.addActionListener(buttonsListener);
        button2.addActionListener(buttonsListener);
        button22.addActionListener(buttonsListener);

        frame.add(label);
        frame.add(button);
        frame.add(label2);
        frame.add(button2);
        frame.add(button22);
        


        
        //Disable the resize option
        frame.setResizable(true);
        frame.setVisible(true);

        System.out.println("Window created it should show up...");

    }


    public static void Func(JLabel label, String command){
        System.out.println("Button was clicked");
        label.setText("Button was clicked");
        System.out.println("Button clicked! Action Command: " + command);
    }
}
