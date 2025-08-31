import javax.swing.*;
import java.awt.event.*;

public class Lab16 extends JFrame implements KeyListener {
    JTextField textField;

    Lab16() {
        setTitle("Numeric JTextField");
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        textField.addKeyListener(this);

        add(textField);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
            e.consume(); // Ignore non-digit characters
        }
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Lab16();
    }
}
