import javax.swing.JOptionPane;
import javax.swing.JFrame; // Import JFrame

public class MultiplePopups {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(false); // Make frame invisible

        int numberOfPopups = 5; // Number of popups

        for (int i = 0; i < numberOfPopups; i++) {
            final int messageNumber = i;  // Variable for the lambda.

            // Using Swing's JOptionPane to create message dialogs:
            JOptionPane.showMessageDialog(frame, "Popup " + (messageNumber + 1)); // Added +1 for better UX
        }
    }
}