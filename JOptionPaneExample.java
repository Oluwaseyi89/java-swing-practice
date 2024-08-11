import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneExample extends JFrame implements ActionListener {

        JPanel panel;
        JPanel innerPanel;
        JButton msgBtn, confirmBtn, optionBtn, inputBtn;

    public JOptionPaneExample () {

        panel = new JPanel(new BorderLayout());
        innerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 40));
        panel.setBackground(Color.white);
        panel.setOpaque(true);

        msgBtn = new JButton("Message Dialog");
        msgBtn.setForeground(Color.blue);
        msgBtn.setFocusable(false);
        msgBtn.addActionListener(this);
        confirmBtn = new JButton("Confirm Dialog");
        confirmBtn.setForeground(Color.blue);
        confirmBtn.setFocusable(false);
        confirmBtn.addActionListener(this);
        inputBtn = new JButton("Input Dialog");
        inputBtn.setForeground(Color.blue);
        inputBtn.setFocusable(false);
        inputBtn.addActionListener(this);
        optionBtn = new JButton("Option Dialog");
        optionBtn.setForeground(Color.blue);
        optionBtn.setFocusable(false);
        optionBtn.addActionListener(this);

        innerPanel.setBackground(Color.green);
        innerPanel.setPreferredSize(new Dimension(1440, 100));

        innerPanel.add(msgBtn);
        innerPanel.add(confirmBtn);
        innerPanel.add(inputBtn);
        innerPanel.add(optionBtn);

        panel.add(innerPanel, BorderLayout.NORTH);

        this.setTitle("JOptionPaneExample");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1440, 980);
        this.setBackground(Color.white);
        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == msgBtn) {
            JOptionPane.showMessageDialog(this, "This is a Message Dialog", "Message Dialog", JOptionPane.PLAIN_MESSAGE );
        } else if (e.getSource() == confirmBtn) {
            int response = JOptionPane.showConfirmDialog(this, "Do you want a Pizza?", "Snack Choice", JOptionPane.YES_NO_CANCEL_OPTION);

            switch (response) {
                case 0: System.out.println("User Chose \"Yes\"");
                break;
                case 1: System.out.println("User Chose \"No\"");
                break;
                case 2: System.out.println("User chose \"Cancel\"");
                break;
                default: System.out.println("User closed the Dialog");
            }

        } else if (e.getSource() == inputBtn) {
                String response = JOptionPane.showInputDialog("Please, what is your name?");
                if(response != null && !response.isEmpty()) {
                    System.out.println("The user's name is " + response);
                } else {
                    System.out.println("The user closed or cancel the Dialog");
                }

        } else if (e.getSource() == optionBtn) {
            String[] options = {"Male", "Female"}; //response value is the index of the element chosen in the array;
            int response = JOptionPane.showOptionDialog(this, "What is your gender?", "Gender Choice", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, "Male" );
            switch (response) {
                case 0: System.out.println("The user is a Male");
                break;
                case 1: System.out.println("The user is a Female");
                break;
            }
        }
    }
}
