import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Lab14 extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton readButton, writeButton;

    Lab14() {
        setTitle("Read/Write File GUI");
        setLayout(new FlowLayout());

        textArea = new JTextArea(10, 30);
        JScrollPane scroll = new JScrollPane(textArea);

        readButton = new JButton("Read");
        writeButton = new JButton("Write");

        readButton.addActionListener(this);
        writeButton.addActionListener(this);

        add(scroll);
        add(writeButton);
        add(readButton);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == writeButton) {
            try {
                FileWriter fw = new FileWriter("userinput.txt");
                fw.write(textArea.getText());
                fw.close();
                JOptionPane.showMessageDialog(this, "Text written to file successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } else if (e.getSource() == readButton) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("userinput.txt"));
                String line, content = "";
                while ((line = br.readLine()) != null) {
                    content += line + "\n";
                }
                br.close();
                textArea.setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Lab14();
    }
}
