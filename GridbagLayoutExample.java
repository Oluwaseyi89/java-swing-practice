import javax.swing.*;
import java.awt.*;

public class GridbagLayoutExample {

    JFrame frame;
    JPanel panel;
    GridBagLayout layout;
    GridBagConstraints constraints;

    public GridbagLayoutExample () {
        frame = new JFrame();
        panel = new JPanel();
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();

        panel.setLayout(layout);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;

        panel.add(new JButton("Btn 1"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;

        panel.add(new JButton("Btn 2"), constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 0;
        constraints.gridy = 1;

        panel.add(new JButton("Btn 3"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;

        panel.add(new JButton("Btn 4"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = 2;

        panel.add(new JButton("Btn 5"), constraints);


        frame.setTitle("GridbagLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(new Dimension(1024, 800));
        panel.setBackground(Color.yellow);
        panel.setOpaque(true);


        frame.setSize(new Dimension(1024, 800));
        frame.setBackground(Color.white);
        frame.add(panel);
        frame.setVisible(true);
    }
}
