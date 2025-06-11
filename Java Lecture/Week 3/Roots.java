import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Roots {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Roots Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String aVal = JOptionPane.showInputDialog(frame, "Enter A value");
        String bVal = JOptionPane.showInputDialog(frame, "Enter B value");
        String cVal = JOptionPane.showInputDialog(frame, "Enter C value");

        double a = Double.parseDouble(aVal);
        double b = Double.parseDouble(bVal);
        double c = Double.parseDouble(cVal);

        double d = (b*b) - 4*a*c;

        if(d < 0){
            JOptionPane.showMessageDialog(frame, "No real Roots.");
        } else if(d == 0){
            JOptionPane.showMessageDialog(frame, "Equal Roots.");
        }else{
            JOptionPane.showMessageDialog(frame, "One real root.");
        }

        frame.dispose();

    }
}
