import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class SecondFrame {
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JOptionPane optionPane;
    MenuBar menuBar;

    public SecondFrame() {
        frame = new JFrame();
//        frame.setLayout(new FlowLayout());
        frame.setLayout(new BorderLayout());
        optionPane = new JOptionPane();
        panel2 = new JPanel();
        menuBar = new MenuBar();
        panel2.setBackground(Color.pink);
        panel2.setSize(new Dimension(500, 500));
        panel2.setOpaque(true);
        panel = new JPanel(new MigLayout("", "[]200[]200[]", "[]50[]50[]"));
        panel.setBackground(Color.green);
        panel.setSize(new Dimension(800, 800));
        panel.add(makeJLabel("Btn1", Color.blue, new Dimension(100, 100)));
        panel.add(makeJLabel("Btn2", Color.blue, new Dimension(40, 40)));
        panel.add(makeJLabel("Btn3", Color.red, new Dimension(40, 40)), "wrap");
        panel.add(makeJLabel("Btn4", Color.blue, new Dimension(40, 40)));
        panel.add(makeJLabel("Btn5", Color.blue, new Dimension(40, 40)));
        panel.add(makeJLabel("Btn6", Color.red, new Dimension(40, 40)), "wrap");
        panel.add(makeJLabel("Btn7", Color.blue, new Dimension(40, 40)));
        panel.add(makeJLabel("Btn8", Color.blue, new Dimension(40, 40)));
        panel.add(makeJLabel("Btn9", Color.red, new Dimension(40, 40)), "wrap");
        panel.add(makeJLabel("Btn10", Color.blue, new Dimension(40, 40)), "right");
        optionPane.showMessageDialog(panel2, "This is my message", "This is the title", JOptionPane.PLAIN_MESSAGE);
//        panel.add(optionPane);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setMenuBar(menuBar);
        frame.add(panel2);
//        frame.pack();
        frame.setVisible(true);

    }

    JLabel makeJLabel(String value, Color bgColor, Dimension dimension) {
        JLabel label = new JLabel();
        label.setText(value);
        label.setSize(dimension);
        label.setBackground(bgColor);
        label.setOpaque(true);

        return label;
    }


}
