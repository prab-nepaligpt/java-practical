import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab12 extends JFrame implements ActionListener {
    JButton redButton, blueButton, greenButton;

    Lab12() {
        setTitle("Color Buttons");
        setLayout(new FlowLayout());

        redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        greenButton = new JButton("GREEN");

        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);

        add(redButton);
        add(blueButton);
        add(greenButton);

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            redButton.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            blueButton.setBackground(Color.BLUE);
        } else if (e.getSource() == greenButton) {
            greenButton.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Lab12();
    }
}
