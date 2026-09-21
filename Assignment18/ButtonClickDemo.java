import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClickDemo extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ButtonClickDemo() {

        setTitle("Button Click Event");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Click the button");
        button = new JButton("Click Me");

        add(label);
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked successfully!");
    }

    public static void main(String[] args) {
        new ButtonClickDemo();
    }
}