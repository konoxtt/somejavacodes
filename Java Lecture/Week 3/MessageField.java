
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Message Feild.");
        String password = JOptionPane.showInputDialog(frame, "Enter your Password");

        if (password != null) {
            System.out.println("Entered password: " + password); // Print the entered password (for demonstration)
        } else {
            JOptionPane.showMessageDialog(null, "You Forgot to Enter the Password");
            System.out.println("User cancelled or closed the dialog."); // Handle cancellation or close
        }
        frame.dispose();

    }
}
