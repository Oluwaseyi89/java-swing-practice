import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame implements ActionListener {

    JRadioButton pizzaButton, hamburgerButton, hotdogButton;
    ButtonGroup group;
    JPanel panel;
    JPanel innerPanel;

    ImageIcon pizzaIcon, hamburgerIcon, hotdogIcon;

    public JRadioButtonExample () {

        pizzaIcon = new ImageIcon("./images/pizzaicon.png");
        hamburgerIcon = new ImageIcon("./images/hamburgericon.png");
        hotdogIcon = new ImageIcon("./images/hotdogicon.png");

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");
        group = new ButtonGroup();

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        panel = new JPanel();

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        innerPanel = new JPanel(new GridLayout(3, 1, 0, 25));

        innerPanel.add(pizzaButton);
        innerPanel.add(hamburgerButton);
        innerPanel.add(hotdogButton);

        panel.add(innerPanel);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1440, 980);
        this.setTitle("JRadioButtonExample");
        this.setBackground(Color.white);
        this.add(panel);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered for a Pizza");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered for a Hamburger");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered for a Hotdog");
        }
    }
}
