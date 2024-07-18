import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MigLayoutExample {

    JFrame frame;
    JPanel panel;
    JLabel firstNameLabel, lastNameLabel, addressLabel;
    JTextField firstName, lastName, address;

    public MigLayoutExample() {
        frame = new JFrame();
        panel = new JPanel(new MigLayout());
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



        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(1024, 800));
        frame.setBackground(Color.white);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
