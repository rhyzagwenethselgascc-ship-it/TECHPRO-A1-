import javax.swing.JButton;
import javax.swing.JFrame;

public class Assignment2part5 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Absolute Positioning");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // 1. Disable the layout manager
        frame.setLayout(null);

        // Create Button 1
        JButton btn1 = new JButton("Button 1");
        // Set bounds: (x, y, width, height)
        btn1.setBounds(50, 50, 150, 40);

        // Create Button 2
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(150, 120, 150, 40);

        frame.add(btn1);
        frame.add(btn2);

        frame.setVisible(true);
    }
}