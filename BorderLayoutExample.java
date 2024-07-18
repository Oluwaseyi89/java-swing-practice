import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

    JFrame frame;
    JPanel panel;
    JPanel innerPanel;
    JPanel innerPanel2;
    JPanel innerPanel3;
    public BorderLayoutExample () {
        frame = new JFrame();
        panel = new JPanel(new BorderLayout());
        panel.setBounds(0, 0, 1024, 900);
        panel.setBackground(Color.green);
        panel.setOpaque(true);
        innerPanel = new JPanel();
        innerPanel2 = new JPanel();
        innerPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 25));
        innerPanel3.add(new JButton("Btn1"));
        innerPanel3.add(new JButton("Btn2"));
        innerPanel3.add(new JButton("Btn3"));
        innerPanel3.add(new JButton("Btn4"));
        innerPanel3.add(new JButton("Btn5"));
        innerPanel3.add(new JButton("Btn6"));
        innerPanel3.add(new JButton("Btn7"));
        innerPanel3.add(new JButton("Btn8"));
        innerPanel3.add(new JButton("Btn9"));
        innerPanel3.add(new JButton("Btn10"));
        innerPanel.setSize(new Dimension(100, 100));
        innerPanel.setBounds(0, 0, 100, 200);
        innerPanel.setBackground(Color.yellow);
        innerPanel.setOpaque(true);
        innerPanel.add(new JLabel("This is Innerpanel"));
        innerPanel.add(new JLabel("This is another Innerpanel"));
        innerPanel.setForeground(Color.pink);
        innerPanel.setBorder(BorderFactory.createEtchedBorder(Color.blue, Color.lightGray));
        innerPanel2.setBackground(Color.orange);
        innerPanel2.setSize(new Dimension(300, 300));
        innerPanel2.setOpaque(true);

        innerPanel3.setBackground(Color.blue);
        innerPanel3.setOpaque(true);
//        innerPanel3.add(new JLabel("Panel3"));
        panel.add(innerPanel, BorderLayout.WEST);
        panel.add(innerPanel2, BorderLayout.CENTER);
        panel.add(innerPanel3, BorderLayout.NORTH);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("BorderLayout Example");
        frame.setBounds(0, 0, 1024, 900);
        frame.setBackground(Color.white);
        frame.add(panel);
        frame.setVisible(true);
    }
}
