package pl.sda;

import javax.swing.*;

public class SwingCalculator {
    private JPanel mainPanel;
    private JTextField resultTextField;
    private JButton cButton;
    private JButton plusButton;
    private JButton a1Button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;


    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingCalculator");
        frame.setContentPane(new SwingCalculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 150, 0,0);
        frame.pack();
        frame.setSize(270, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
