
import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends MouseAdapter {

    JFrame jFrame = new JFrame();
    JButton myButton = new JButton("Click");
    JPanel myPanel = new JPanel();
    JPanel innerPanel = new JPanel();
    JTextField textField = new JTextField();
    JLabel jLabel = new JLabel();
    
    public MyFrame() {
        
        myButton.setBackground(Color.black);
        myButton.setForeground(Color.white);
        myButton.setVisible(true);
        myButton.setFocusable(false);
        myButton.setSize(80, 25);
        myButton.setFont(new Font("Comic Sans", Font.BOLD, 25));
        
        // myButton.addActionListener(MyFrame.this);
        myButton.addMouseListener(MyFrame.this);
        myButton.addMouseListener(MyFrame.this);

        textField.setPreferredSize(new Dimension(120, 60));
        textField.setVisible(true);
        textField.setForeground(Color.blue);

        jLabel.setPreferredSize(new Dimension(80, 45));
        jLabel.setBackground(Color.yellow);
        jLabel.setOpaque(true);
        jLabel.setForeground(Color.black);
        jLabel.setText("I am Oluwaseyi");

        innerPanel.setPreferredSize(new Dimension(800, 150));
        // innerPanel.setBounds(0, 0, 800, 150);
        innerPanel.setBackground(Color.white);
        // innerPanel.setLayout(new GridLayout(1, 3));
        // innerPanel.setLayout(new BorderLayout());
        // innerPanel.setLayout(null);
        // innerPanel.setLayout(new BorderLayout(200, 200));
        // innerPanel.setLayout(new BoxLayout(new Container(), 0));
        // innerPanel.setLayout(new CardLayout());
//        innerPanel.setLayout(new GridBagLayout());
         innerPanel.setLayout(new MigLayout("wrap", "[]","[][][]"));
        // innerPanel.setLayout(new GroupLayout(new Container()));
        // innerPanel.setLayout(new SpringLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        GridBagConstraints gbd = new GridBagConstraints();
//        GridBagConstraints gbe = new GridBagConstraints();
//        gbc.weightx = 10.0;
//        gbc.weighty = 25.0;
//        innerPanel.add(myButton, gbc);
//        gbd.weightx = 45.0;
//        gbd.weighty = 25.0;
//        innerPanel.add(textField, gbd);
//        gbe.weightx = 85.0;
//        gbe.weighty = 25.0;
         innerPanel.add(myButton);
        innerPanel.add(jLabel);
         innerPanel.add(textField);
        // innerPanel.add(myButton, "pos 0, 150");
        // innerPanel.add(textField, "pos 150, 100");
        // innerPanel.add(jLabel, "pos 250, 150");

    
        myPanel.setVisible(true);
        myPanel.setPreferredSize(new Dimension(1024, 760));
        // myPanel.setSize(420, 420);
        // myPanel.setBounds(0, 0, 1024, 760);
        myPanel.setLayout(new FlowLayout());
        myPanel.setBackground(Color.blue);
        myPanel.setOpaque(true);
        myPanel.setForeground(Color.white);
        // myPanel.setLayout(new GridLayout(1, 3));
        // myPanel.add(myButton);
        // myPanel.add(textField);
        // myPanel.add(jLabel);
        myPanel.add(innerPanel);

        jFrame.setSize(1024, 760);
        jFrame.setBackground(Color.white);
        jFrame.setForeground(Color.black);
        jFrame.setLayout(new FlowLayout());
        // jFrame.setLayout(new GridLayout(3, 1));
        // jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jFrame.setTitle("Practice App 1.0"); 
        jFrame.add(myPanel);
        jFrame.pack();
        jFrame.setVisible(true);  
    }

    // @Override
    // public void actionPerformed (ActionEvent e) {
    //     if(e.getSource() == myButton) {
    //         myPanel.setBackground(Color.red);
    //         myPanel.setOpaque(true);
    //         myButton.setText("Clicked");
    //         if(myButton.getText().equals("Click")) {
    //             myButton.setText("Clicked");
    //             } else {
    //             myButton.setText("Click");
    //         }
    //     }

    // }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource() == myButton) {
            myButton.setBackground(Color.orange);
            myButton.setOpaque(true);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == myButton) {
            myButton.setBackground(Color.black);
            myButton.setOpaque(true);
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == myButton) {
            myPanel.setBackground(Color.red);
            myPanel.setOpaque(true);
            myButton.setText("Clicked");
            if(myButton.getText().equals("Click")) {
                myButton.setText("Clicked");
                } else {
                myButton.setText("Click");
            }
        }

    }

    // @Override
    // public void mouseReleased(MouseEvent e) {

    // }
    
    // @Override
    // public void mousePressed(MouseEvent e) {

    // }

 
    
}
