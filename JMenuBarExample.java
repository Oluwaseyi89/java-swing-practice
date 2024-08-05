import javax.swing.*;
import java.awt.*;

public class JMenuBarExample extends JFrame {


    JMenuBar menuBar;
    JMenuItem loadItem, saveItem, exitItem;
    JMenu fileMenu, editMenu, helpMenu;
    public JMenuBarExample () {

        menuBar = new JMenuBar();
//        menuBar.setBackground(Color.blue);
//        menuBar.setSize(new Dimension(1440, 300));
//        menuBar.setOpaque(true);

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        saveItem = new JMenuItem("save");
        loadItem = new JMenuItem("load");
        exitItem = new JMenuItem("exit");


        exitItem.addActionListener((e) -> {
            System.exit(0);
        });

        saveItem.addActionListener((e) -> {
            System.out.println("Data Saved!");
        });

        loadItem.addActionListener((e) -> {
            System.out.println("Loading data...");
        });
        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);







        this.setBounds(0, 0, 1440, 980);
        this.setTitle("JMenuBarExample");
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setJMenuBar(menuBar);
//        this.add(menuBar, BorderLayout.NORTH);


    }
}
