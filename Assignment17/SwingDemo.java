import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Demo");

        JLabel label = new JLabel("Hello, Welcome to Java Swing!");
        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 120, 40);
        label.setBounds(70, 50, 250, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(350, 220);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}