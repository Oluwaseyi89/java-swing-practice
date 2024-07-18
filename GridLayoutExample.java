import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.concurrent.Flow;

public class GridLayoutExample {
    JFrame frame;
    JPanel panel;
    JPanel innerPanel;

    public GridLayoutExample() {
        frame = new JFrame("GridLayout Example");
        frame.setBounds(0, 0, 1024, 900);
        innerPanel = new JPanel(new GridLayout(3, 3, 15, 15));
        innerPanel.setSize(new Dimension(300, 300));
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, ((frame.getWidth() - innerPanel.getWidth())/2), ((frame.getHeight() - innerPanel.getHeight())/2)));
        panel.setBackground(Color.yellow);
        innerPanel.setBackground(Color.white);
        innerPanel.setOpaque(true);
        innerPanel.add(new JButton("Btn 1"));
        innerPanel.add(new JButton("Btn 2"));
        innerPanel.add(new JButton("Btn 3"));
        innerPanel.add(new JButton("Btn 4"));
        innerPanel.add(new JButton("Btn 5"));
        innerPanel.add(new JButton("Btn 6"));
        innerPanel.add(new JButton("Btn 7"));
        innerPanel.add(new JButton("Btn 8"));
        innerPanel.add(new JButton("Btn 9"));
        panel.add(innerPanel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.white);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
