package pl.sda;

import javax.swing.*;

public class SwingMenu {
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingMenu");
        frame.setContentPane(new SwingMenu().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMenu(frame);
        frame.pack();
        frame.setSize(500, 300);
        frame.setBounds(200, 150, frame.getWidth(), frame.getHeight());
        frame.setVisible(true);
    }

    private static void addMenu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        JMenu searchMenu = new JMenu("Search");
        JMenuItem findItem = new JMenuItem("Find");
        searchMenu.add(findItem);
        
        menuBar.add(searchMenu);

        //utworzyć 2 obiekty JMenu
        //utworzyć obiekty JMenuItem i powiązać je z JMenu

        //powiązać JMenu z JMenuBar
        frame.setJMenuBar(menuBar);
    }
}
