import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MigLayoutExample {

    JFrame frame;
    JPanel panel;
    JPanel containerPanel;
    JLabel firstNameLabel, lastNameLabel, addressLabel;
    JTextField firstName, lastName, address;

    public MigLayoutExample() {
        frame = new JFrame();
        frame.setSize(new Dimension(1260, 920));
        panel = new JPanel(new MigLayout());
        panel.setSize(new Dimension(300, 200));
        containerPanel = new JPanel();
        containerPanel.setBackground(Color.yellow);
        panel.setBackground(Color.yellow);

        firstName = new JTextField(15);
        firstNameLabel = new JLabel("First Name");

        lastName = new JTextField(15);
        lastNameLabel = new JLabel("Last Name");

        address = new JTextField(15);
        addressLabel = new JLabel("Address");


        panel.add(firstNameLabel);
        panel.add(firstName);
        panel.add(lastNameLabel, "gap unrelated");
        panel.add(lastName, "wrap");
        panel.add(addressLabel);
        panel.add(address, "span, grow");

//        containerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 300));
        containerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, ((frame.getWidth() - panel.getWidth())/2), ((frame.getHeight() - panel.getHeight())/2)));

        containerPanel.add(panel);



        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.add(containerPanel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
