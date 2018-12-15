package pl.sda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SwingMenu {
    private JPanel mainPanel;
    private JLabel myLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingMenu");

        SwingMenu main = new SwingMenu();
        frame.setContentPane(main.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMenu(frame, main.myLabel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setBounds(200, 150, frame.getWidth(), frame.getHeight());
        frame.setVisible(true);
    }

    private static void addMenu(final JFrame frame, final JLabel myLabel2) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        //dodać action listener do openItem
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //dodać JFileChooser
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(null);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    myLabel2.setText(file.getName());
                }
            }
        });

        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        JMenu searchMenu = new JMenu("Search");
        JMenuItem findItem = new JMenuItem("Find");
        searchMenu.add(findItem);

        menuBar.add(searchMenu);

        frame.setJMenuBar(menuBar);
    }
}
