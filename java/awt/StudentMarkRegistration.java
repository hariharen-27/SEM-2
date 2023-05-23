
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class StudentMarkRegistration extends JFrame implements ActionListener {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel mark1Label;
    private JTextField mark1Field;
    private JLabel mark2Label;
    private JTextField mark2Field;
    private JLabel mark3Label;
    private JTextField mark3Field;
    private JButton registerButton;

    public StudentMarkRegistration() {
        setTitle("Student Mark Registration");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name: ");
        nameField = new JTextField(10);
        mark1Label = new JLabel("Mark 1: ");
        mark1Field = new JTextField(10);
        mark2Label = new JLabel("Mark 2: ");
        mark2Field = new JTextField(10);
        mark3Label = new JLabel("Mark 3: ");
        mark3Field = new JTextField(10);
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(mark1Label);
        add(mark1Field);
        add(mark2Label);
        add(mark2Field);
        add(mark3Label);
        add(mark3Field);
        add(registerButton);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == registerButton) {
            String name = nameField.getText();
            int mark1 = Integer.parseInt(mark1Field.getText());
            int mark2 = Integer.parseInt(mark2Field.getText());
            int mark3 = Integer.parseInt(mark3Field.getText());

            int total = mark1 + mark2 + mark3;
            double average = total / 3.0;

            String result = "Total: " + total + "\n";
            result += "Average: " + String.format("%.2f", average) + "\n";

            if (average >= 40) {
                result += "Status: Pass";
            } else {
                result += "Status: Fail";
            }

            JOptionPane.showMessageDialog(this, result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentMarkRegistration registration = new StudentMarkRegistration();
            registration.setVisible(true);
        });
    }
}