import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);

        Subject displayedSubject = math;

        JFrame frame = new JFrame("Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        JLabel icon = new JLabel(img);
        frame.add(icon);

        JLabel name = new JLabel(displayedSubject.getName());
        frame.add(name);

        JLabel units = new JLabel(Double.toString(displayedSubject.getUnits()));
        frame.add(units);

        JLabel grades = new JLabel(Double.toString(displayedSubject.getGrade()));
        frame.add(grades);

        JButton next = new JButton("Next");
        frame.add(next);

        frame.setVisible(true);
    }
}