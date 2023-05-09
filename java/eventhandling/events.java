package eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class events extends JFrame implements ActionListener {
   
    Container c = getContentPane();
   
    JLabel l1= new JLabel("Enter First Number : ");
    JLabel l2 = new JLabel("Enter Second Number : ");
   
    JLabel result = new JLabel();
    JTextField t1 = new JTextField(20);
    JTextField t2= new JTextField(20);

    JButton add = new JButton("ADD");
    JButton subtract = new JButton("SUBTRACT");
    JButton multiply = new JButton("MULTIPLY");
    JButton divide = new JButton("DIVIDE");
   
    public events(){
        super("Simple Basic Calculator");
        setSize(300,300);
       
        c.setLayout(new FlowLayout());
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(add);
        c.add(subtract);
        c.add(multiply);
        c.add(divide);
        c.add(result);
       
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        String ans1 = t1.getText();
        int num1 = Integer.parseInt(ans1);
        String ans2 = t2.getText();
        int num2 = Integer.parseInt(ans2);
        int RESULT;
       
        if(source == add){
            RESULT = num1 + num2;
            String res = Integer.toString(RESULT);
            result.setText("Result of Addition of given Two Numbers : " + res);
        }

        if(source == subtract){
            RESULT = num1 - num2;
            String res = Integer.toString(RESULT);
            result.setText("Result of Subtraction of given Two Numbers : " + res);
        }

        if(source == multiply){
            RESULT = num1 * num2;
            String res = Integer.toString(RESULT);
            result.setText("Result of Multiplication of given Two Numbers : " + res);
        }

        if(source == divide){            
            Double RESULT1 = Double.valueOf(num1) / Double.valueOf(num2);
            String res = RESULT1.toString();
            result.setText("Result of Division of given Two Numbers : " + res);
        }

    }
    public static void main(String[] args){
        events demo = new events();
        demo.setVisible(true);
    }
}
