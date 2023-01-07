
package JarvisX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddNEmp extends JFrame implements ActionListener {
    JLabel head;
    JButton bgl;
    JButton back;
    JButton addemp;

    JLabel name;
    JTextField name1;
    JLabel username;
    JTextField username1;
    JLabel password;
    JPasswordField password1;
    AddNEmp(){
        head = new JLabel();
        head.setText("Add New Employee");
        head.setFont(new Font("Helvetica", Font.BOLD, 30));
        head.setBounds(100,-105,500,300);
        head.setForeground(new Color(0xffffff));

        bgl = new JButton();
        bgl.setFont(new Font("Sans Serif", Font.BOLD,10));
        bgl.setBackground(new Color(0xff0033));
        bgl.setBounds(100,80,100,3);
        bgl.setForeground(new Color(0xff0033));
        bgl.setBorder(null);
        bgl.setRolloverEnabled(false);
        bgl.setVisible(true);

        name = new JLabel();
        name.setText("Name");
        name.setFont(new Font("Helvetica", Font.PLAIN, 15));
        name.setBounds(350, 60, 500, 300);
        name.setForeground(new Color(0xFFFFFF));



        name1 = new JTextField();
        name1.setVisible(true);
        name1.setBounds(450, 200, 300, 30);
        name1.setBackground(new Color(0x181818));
        name1.setForeground(new Color(0xFFFFFF));
        name1.setPreferredSize(new Dimension(290, 25));
        name1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

        username = new JLabel();
        username.setText("Username");
        username.setFont(new Font("Helvetica", Font.PLAIN, 15));
        username.setBounds(350, 160, 500, 300);
        username.setForeground(new Color(0xFFFFFF));



        username1 = new JTextField();
        username1.setVisible(true);
        username1.setBounds(450, 300, 300, 30);
        username1.setBackground(new Color(0x181818));
        username1.setForeground(new Color(0xFFFFFF));
        username1.setPreferredSize(new Dimension(290, 25));
        username1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

        password = new JLabel();
        password.setText("Password");
        password.setFont(new Font("Helvetica", Font.PLAIN, 15));
        password.setBounds(350, 260, 500, 300);
        password.setForeground(new Color(0xFFFFFF));



        password1 = new JPasswordField();
        password1.setVisible(true);
        password1.setBounds(450, 400, 300, 30);
        password1.setBackground(new Color(0x181818));
        password1.setForeground(new Color(0xFFFFFF));
        password1.setPreferredSize(new Dimension(290, 25));
        password1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));







        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        back.addActionListener(this);

        addemp = new JButton();
        addemp.setFocusable(false);
        addemp.setText("Add Employee");
        addemp.setFont(new Font("Sans Serif", Font.BOLD, 15));
        addemp.setBackground(new Color(0xDC7633));
        addemp.setBounds(960, 580, 140, 40);
        addemp.setForeground(new Color(0xFFFFFF));
        addemp.setBorder(null);
        addemp.addActionListener(this);


        this.add(password1);
        this.add(password);
        this.add(username1);
        this.add(username);
        this.add(name);
        this.add(name1);
        this.add(addemp);
        this.add(back);
        this.add(head);
        this.add(bgl);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent a){
        //MANAGER
        if (a.getSource()==addemp){
            this.dispose();
            DataBase db = new DataBase();
            db.addDBEmp(username1.getText(), password1.getText(), name1.getText());
            box b = new box();
            b.Added("Added Employee Successfuly.");
        }
        else if (a.getSource()==back){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }

    }
}
