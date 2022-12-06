package jarvis;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EmpDashboard extends JFrame implements ActionListener {
    JLabel h;
    JButton bgl;
    JLabel h1;
    JButton bgl1;
    JComboBox pro;
    DataBase db = new DataBase();
    JButton det;
    JButton logout;
    JLabel h2;
    JLabel h3;
    JButton bgl2;
    JButton back;

    EmpDashboard() {

        h = new JLabel();
        h.setText("Welcome, Employee!");
        h.setFont(new Font("Helvetica", Font.BOLD, 30));
        h.setBounds(100, -105, 500, 300);
        h.setForeground(new Color(0xffffff));

        bgl = new JButton();
        bgl.setFont(new Font("Sans Serif", Font.BOLD, 10));
        bgl.setBackground(new Color(0x4F64FB));
        bgl.setBounds(100, 80, 100, 3);
        bgl.setForeground(new Color(0x333333));
        bgl.setBorder(null);
        bgl.setRolloverEnabled(false);
        bgl.setVisible(true);

        bgl1 = new JButton();
        bgl1.setFont(new Font("Sans Serif", Font.BOLD, 10));
        bgl1.setBackground(new Color(0xff0033));
        bgl1.setBounds(210, 210, 20, 3);
        bgl1.setForeground(new Color(0x333333));
        bgl1.setBorder(null);
        bgl1.setRolloverEnabled(false);
        bgl1.setVisible(true);

        h1 = new JLabel();
        h1.setText("Your Projects");
        h1.setFont(new Font("Helvetica", Font.BOLD, 22));
        h1.setBounds(210, 40, 550, 300);
        h1.setForeground(new Color(0xffffff));


        pro = new JComboBox(db.dbemppros);
        pro.addActionListener(this);
        pro.setBounds(210, 250, 200, 40);
        pro.setBackground(new Color(0xc2f2fc));
        pro.setForeground(new Color(0x111111));
        pro.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));

        det = new JButton();
        det.setFocusable(false);
        det.setText("See Details");
        det.setFont(new Font("Sans Serif", Font.BOLD, 15));
        det.setBackground(new Color(0x4F64FB));
        det.setBounds(430, 250, 140, 40);
        det.setForeground(new Color(0xFFFFFF));
        det.setBorder(null);
        det.addActionListener(this);

        logout = new JButton();
        logout.setFocusable(false);
        logout.setText("Logout");
        logout.setFont(new Font("Sans Serif", Font.BOLD, 15));
        logout.setBackground(new Color(0x2ECC71));
        logout.setBounds(590, 250, 140, 40);
        logout.setForeground(new Color(0xFFFFFF));
        logout.setBorder(null);
        logout.addActionListener(this);

        h2 = new JLabel();
        h2.setText("Note from Manager");
        h2.setFont(new Font("Helvetica", Font.BOLD, 22));
        h2.setBounds(210,250,500,300);
        h2.setForeground(new Color(0xffffff));

        bgl2 = new JButton();
        bgl2.setFont(new Font("Sans Serif", Font.BOLD,10));
        bgl2.setBackground(new Color(0xff0033));
        bgl2.setBounds(210,420,20,3);
        bgl2.setForeground(new Color(0x333333));
        bgl2.setBorder(null);
        bgl2.setRolloverEnabled(false);
        bgl2.setVisible(true);

        h3 = new JLabel();
        h3.setText("<html>"+"Please complete your work on time."+"<br />"+"Always mark projects as completed when done."+"<br />"+"Thanks!"+"</html");
        h3.setFont(new Font("Helvetica", Font.PLAIN, 22));
        h3.setBounds(210,330,500,300);
        h3.setForeground(new Color(0xffffff));

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        back.addActionListener(this);
        this.add(back);

        this.add(h2);
        this.add(bgl2);
        this.add(h3);
        this.add(logout);
        this.add(det);
        this.add(pro);
        this.add(bgl);
        this.add(bgl1);
        this.add(h);
        this.add(h1);
        this.setLayout(null);
        this.setTitle("JarvisX - The Agency Management System");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent a) {
        //MANAGER
        if (a.getSource() == det) {

            this.dispose();
            String s;
            s = String.valueOf(pro.getSelectedItem());
            EmpProjectDetails epd = new EmpProjectDetails(s);
        }
        else if (a.getSource() == logout) {

            this.dispose();
            WelcSc ws = new WelcSc();
        }
        else if (a.getSource()==back){

            this.dispose();
            LoginPanel lp = new LoginPanel("emp");

        }
    }
}
