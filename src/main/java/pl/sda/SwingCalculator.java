package pl.sda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator {
    private JPanel mainPanel;
    private JTextField resultTextField;
    private JButton cButton;
    private JButton plusButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton button0;
    private JButton commaButton;
    private JButton buttonEquls;

    private Integer dzialanie;
    private Double liczba1;
    private Double liczba2;

    public SwingCalculator() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleNumberClicked("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleNumberClicked("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleNumberClicked("3");
            }
        });
        cButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText("");
            }
        });
    }

    private void handleNumberClicked(String value) {
        resultTextField.setText(resultTextField.getText() + value);
        if (liczba1 == null) {
            liczba1 = Double.valueOf(value);
        } else {
            liczba2 = Double.valueOf(value);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingCalculator");
        frame.setContentPane(new SwingCalculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 150, 0,0);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
