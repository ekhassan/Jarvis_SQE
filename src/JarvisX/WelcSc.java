package JarvisX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class WelcSc extends JFrame implements ActionListener{

    JButton b1;
    JButton b2;
    JButton b3;
    JButton x;
    JLabel h;
    JLabel x1;

WelcSc(){
    ImageIcon img = new ImageIcon("Main Screen.png");
    h = new JLabel();

    h.setIcon(img);
    h.setBounds(0, -20, 1200, 700);

    b1 = new JButton();
    b1.setFocusable(false);

    b1.setFont(new Font("Sans Serif", Font.BOLD,15));
    b1.setBackground(new Color(0xDC7633));
    b1.setBounds(64,502,132,43);
    b1.setForeground(new Color(0xFFFFFF));
    b1.setBorder(null);
    b1.addActionListener(this);
    b1.setOpaque(false);

    b2 = new JButton();
    b2.setFocusable(false);

    b2.setFont(new Font("Sans Serif", Font.BOLD,15));
    b2.setBackground(new Color(0x2ECC71));
    b2.setBounds(206,502,132,43);
    b2.setForeground(new Color(0xFFFFFF));
    b2.setBorder(null);
    b2.addActionListener(this);
    b2.setOpaque(false);

    b3 = new JButton();
    b3.setFocusable(false);

    b3.setFont(new Font("Sans Serif", Font.BOLD,15));
    b3.setBackground(new Color(0xB557F6));
    b3.setBounds(348,502,132,43);
    b3.setForeground(new Color(0xFFFFFF));
    b3.setBorder(null);
    b3.addActionListener(this);
    b3.setOpaque(false);

    x = new JButton();
    x.setFocusable(false);

    x.setFont(new Font("Sans Serif", Font.BOLD,15));
    x.setBackground(new Color(0x2ECC71));
    x.setBounds(1170,0,30,30);
    x.setForeground(new Color(0xFFFFFF));
    x.setBorder(null);
    x.addActionListener(this);
    x.setOpaque(false);
    x.addActionListener(this);

    x1 = new JLabel();
    x1.setFocusable(false);
    x1.setText("✖");
    x1.setForeground(new Color(0xffffff));
    x1.setFont(new Font("Sans Serif", Font.PLAIN,12));
    x1.setBackground(new Color(0x2ECC71));
    x1.setBounds(1180,0,30,30);

    x1.setBorder(null);

    this.setLayout(null);
    this.setTitle("JarvisX - The Agency Management System");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1200, 665);
    this.setUndecorated(true);
    this.setResizable(false);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(0x181818));
    this.setLocationRelativeTo(null);

    this.add(x1);
    this.add(x);
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(h);



}
    @Override
    public void actionPerformed(ActionEvent a){
        //MANAGER
        if (a.getSource()==b1){
            this.dispose();
            LoginPanel lp = new LoginPanel(0);

        }
        //EMPLOYEE
        else if (a.getSource()==b2){
            this.dispose();
            LoginPanel lp = new LoginPanel("s");

        }
        //CLIENT
        else if(a.getSource()==b3){
            this.dispose();
            LoginPanel lp = new LoginPanel(2.0f);


        }
        else if(a.getSource()==x){
            System.exit(0);

        }
    }
}
