import java.util.Hashtable;
import java.util.Enumeration;

public class grades {
    public static void main(String[] args) {
        double finals = 0.6;
        double midterm = 0.4;

        // Use Integer for original grade, Double for calculated grade
        Hashtable<Integer, Integer, Double> grades = new Hashtable<>();

        // initialize grades of final and idterm and set the grading 

        grades.put(50, 50); // original grade 50
        grades.put(68, 60); // original grade 60
        grades.put(90, 70); // original grade 70
        grades.put(80, 50); // original grade 80
        grades.put(10, 90); // original grade 90
        grades.put(100, 90); // original grade 100
        grades.put(40, 44); // original grade 40
        

        // calculate grades
        Enumeration<Integer> keys = grades.keys();
        while (keys.hasMoreElements()) {
            int grade = keys.nextElement();
            double calculated = grade * finals + midterm * 100;
            grades.put(grade, calculated);
        }

        // print grades and letter grades
        System.out.println("Original Grade | Calculated Grade | Letter Grade");
        for (Integer original : grades.keySet()) {
            double calculated = grades.get(original);
            String letter;
            if (calculated >= 90) {
                letter = "AA";
            } else if (calculated >= 80) {
                letter = "AB";
            } else if (calculated >= 70) {
                letter = "BB";
            } else if (calculated >= 60) {
                letter = "BC";
            } else if (calculated >= 50) {
                letter = "CD";
            } else if (calculated >= 40) {
                letter = "DD";
            } else {
                letter = "FF";
            }
            System.out.printf("%14d | %16.2f | %11s\n", original, calculated, letter);
        }
    }
}
