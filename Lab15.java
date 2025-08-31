import javax.swing.*;
import java.awt.event.*;

public class Lab15 extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem newItem, saveItem, exitItem;

    Lab15() {
        setTitle("Menu Example");

        // Create menu bar
        menuBar = new JMenuBar();

        // Create menu
        fileMenu = new JMenu("File");

        // Create menu items
        newItem = new JMenuItem("New");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Add action listeners
        newItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Add items to menu
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(this, "New Selected");
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(this, "Save Selected");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Lab15();
    }
}
