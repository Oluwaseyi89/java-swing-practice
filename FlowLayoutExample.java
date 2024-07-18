import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    JFrame frame;
    JPanel panel;

    public FlowLayoutExample() {
        frame = new JFrame();
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 70));
        panel.setBackground(Color.orange);
        panel.setOpaque(true);
        panel.setSize(new Dimension(800, 800));
        panel.setBounds(0, 0, 800, 800);
        panel.add(new JButton("Btn1"));
        panel.add(new JButton("Btn2"));
        panel.add(new JButton("Btn3"));
        panel.add(new JButton("Btn4"));
        panel.add(new JButton("Btn5"));
        panel.add(new JButton("Btn6"));
        panel.add(new JButton("Btn7"));
        panel.add(new JButton("Btn8"));
        panel.add(new JButton("Btn9"));
        panel.add(new JButton("Btn10"));

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(new Dimension(800, 800));

        frame.add(panel);
        frame.setVisible(true);
    }
}
