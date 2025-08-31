import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab13 extends JFrame implements ActionListener {
    JTextField textField;
    JButton showButton;

    Lab13() {
        setTitle("Hello World GUI");
        setLayout(new FlowLayout());

        textField = new JTextField("Hello World", 20);
        showButton = new JButton("Show");

        showButton.addActionListener(this);

        add(textField);
        add(showButton);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, textField.getText());
    }

    public static void main(String[] args) {
        new Lab13();
    }
}
