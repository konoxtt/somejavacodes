import java.awt.event.ActionListener;
import javax.swing.*;

public class quiz {

    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout for absolute positioning

        JLabel label = new JLabel("Day", JLabel.LEFT);
        label.setBounds(80, 20, 100, 20);
        frame.add(label);

        JTextField name = new JTextField();
        name.setBounds(200, 20, 200, 20);
        frame.add(name);

        JLabel label2 = new JLabel("Month", JLabel.LEFT);
        label2.setBounds(80, 60, 100, 20);
        frame.add(label2);

        JTextField name2 = new JTextField();
        name2.setBounds(200, 60, 200, 20);
        frame.add(name2);

        JLabel label3 = new JLabel("Year", JLabel.LEFT);
        label3.setBounds(80, 100, 100, 20);
        frame.add(label3);

        JTextField name3 = new JTextField();
        name3.setBounds(200, 100, 200, 20);
        frame.add(name3);

        JButton nextDay = new JButton("Next Day");
        nextDay.setBounds(200, 140, 100, 30);
        frame.add(nextDay);

        JLabel resultLabel = new JLabel("Next Day:", JLabel.LEFT);
        resultLabel.setBounds(80, 180, 320, 20);
        frame.add(resultLabel);

        ActionListener calculator = e -> {
            String dayText = name.getText();
            String monthText = name2.getText();
            String yearText = name3.getText();

            try {
                int day = Integer.parseInt(dayText);
                int month = Integer.parseInt(monthText);
                int year = Integer.parseInt(yearText);


                int nextDayVal = day + 1;
                int nextMonthVal = month;
                int nextYearVal = year;


                resultLabel.setText(String.format("Next Day: %02d-%02d-%04d", nextDayVal, nextMonthVal, nextYearVal));

            } catch (NumberFormatException ex) { 
                resultLabel.setText("Next Day: Please enter valid numbers.");
            }
        };


        nextDay.addActionListener(calculator);
        frame.setVisible(true);
    } 
}