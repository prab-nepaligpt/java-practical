import javax.swing.*;
import java.awt.event.*;

public class Lab17 extends JFrame implements ItemListener {
    JCheckBox enableCheckBox;
    JRadioButton optionA, optionB, optionC;
    ButtonGroup group;

    Lab17() {
        setTitle("Checkbox & RadioButton Demo");
        setLayout(null);

        enableCheckBox = new JCheckBox("Enable Extra Options");
        enableCheckBox.setBounds(50, 30, 200, 30);
        enableCheckBox.addItemListener(this);

        optionA = new JRadioButton("Option A");
        optionB = new JRadioButton("Option B");
        optionC = new JRadioButton("Option C");

        optionA.setBounds(50, 70, 100, 30);
        optionB.setBounds(50, 100, 100, 30);
        optionC.setBounds(50, 130, 100, 30);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);

        optionA.addItemListener(this);
        optionB.addItemListener(this);
        optionC.addItemListener(this);

        group = new ButtonGroup();
        group.add(optionA);
        group.add(optionB);
        group.add(optionC);

        add(enableCheckBox);
        add(optionA);
        add(optionB);
        add(optionC);

        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == enableCheckBox) {
            boolean selected = enableCheckBox.isSelected();
            optionA.setEnabled(selected);
            optionB.setEnabled(selected);
            optionC.setEnabled(selected);
        } else if (e.getSource() == optionA && e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Option A selected");
        } else if (e.getSource() == optionB && e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Option B selected");
        } else if (e.getSource() == optionC && e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Option C selected");
        }
    }

    public static void main(String[] args) {
        new Lab17();
    }
}
