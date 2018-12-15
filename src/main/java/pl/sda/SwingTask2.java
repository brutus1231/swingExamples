package pl.sda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingTask2 {
    private JPanel mainPanel;
    private JTextField myTextField;
    private JButton clickMeButton;
    private JLabel myLabel;
    private JButton dialogButtonButton;
    private int buttonClickCounter = 0;

    public SwingTask2() {
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myLabel.setText(myTextField.getText());
            }
        });
        myTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyChar());
            }
        });
        dialogButtonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClickCounter++;
                JOptionPane.showMessageDialog(null,
                        getDialogMessage());
            }
        });
    }

    private String getDialogMessage() {
        String message = "Przycisk wciśnięto: " + buttonClickCounter + " raz";
        if (buttonClickCounter > 1) message += "y";

        return message;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTask2");
        frame.setContentPane(new SwingTask2().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 150, frame.getWidth(), frame.getHeight());
        addMenuBar(frame);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    private static void addMenuBar(JFrame frame) {

    }
}
