package pl.sda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldWindow {

    private JPanel mainPanel;
    private JLabel myText;
    private JButton button1;

    public HelloWorldWindow() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknieto przycisk");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldWindow");
        frame.setContentPane(new HelloWorldWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,150, frame.getWidth(), frame.getHeight());
        frame.pack();
        frame.setVisible(true);
    }
}
