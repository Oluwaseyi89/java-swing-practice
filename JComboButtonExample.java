import javax.swing.*;
import java.awt.*;

public class JComboButtonExample extends JFrame {

    JComboBox comboBox;
    JPanel panel;

    String[] animals = {"dog", "cat", "bird"};

    public JComboButtonExample () {

        comboBox = new JComboBox(animals);

        comboBox.addActionListener( e -> {
            System.out.println(comboBox.getSelectedItem());
        });

        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setSize(new Dimension(1440, 980));
        panel.setBackground(Color.white);
        panel.setOpaque(true);

        panel.add(comboBox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.white);
        this.setBounds(0, 0, 1440, 980);
        this.add(panel);
        this.setVisible(true);

    }
}
