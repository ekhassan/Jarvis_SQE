package JarvisX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPanel extends JFrame implements ActionListener{

    public static JTextField uname;
    public static JPasswordField pass;
    public static int mgr;
    public static String emp;
    public static float cl;
    JLabel top;
    JLabel user;
    JLabel passw;
    JButton mlogin;
    JButton mexit;
    JButton elogin;
    JButton eexit;
    JButton clogin;
    JButton cexit;
    JButton back;
    public static int n1;
    LoginPanel(){

    }
    LoginPanel(int mgr) {
        top = new JLabel();
        top.setText("JarvisX - Manager Login");
        top.setFont(new Font("Helvetica", Font.BOLD, 30));
        top.setBounds(400, 0, 500, 300);
        top.setForeground(new Color(0xFFFFFF));

        user = new JLabel();
        user.setText("Enter Username");
        user.setFont(new Font("Helvetica", Font.PLAIN, 20));
        user.setBounds(330, 115, 500, 300);
        user.setForeground(new Color(0xFFFFFF));

        uname = new JTextField();
        uname.setVisible(true);
        uname.setBounds(500, 250, 300, 30);
        uname.setBackground(new Color(0x333333));
        uname.setForeground(new Color(0xFFFFFF));
        uname.setPreferredSize(new Dimension(290, 25));
        uname.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

        passw = new JLabel();
        passw.setText("Enter Password");
        passw.setFont(new Font("Helvetica", Font.PLAIN, 20));
        passw.setBounds(330, 165, 500, 300);
        passw.setForeground(new Color(0xFFFFFF));

        pass = new JPasswordField();
        pass.setVisible(true);
        pass.setBounds(500, 300, 300, 30);
        pass.setBackground(new Color(0x333333));
        pass.setForeground(new Color(0xFFFFFF));
        pass.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

        mlogin = new JButton();
        mlogin.setFocusable(false);
        mlogin.setText("Login");
        mlogin.setFont(new Font("Sans Serif", Font.BOLD, 15));
        mlogin.setBackground(new Color(0xDC7633));
        mlogin.setBounds(660, 360, 140, 40);
        mlogin.setForeground(new Color(0xFFFFFF));
        mlogin.setBorder(null);
        mlogin.addActionListener(this);

        mexit = new JButton();
        mexit.setFocusable(false);
        mexit.setText("Exit");
        mexit.setFont(new Font("Sans Serif", Font.BOLD, 15));
        mexit.setBackground(new Color(0x181818));
        mexit.setBounds(500, 360, 140, 40);
        mexit.setForeground(new Color(0xFFFFFF));
        mexit.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        mexit.addActionListener(this);

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        back.addActionListener(this);

        this.setLayout(null);
        this.setTitle("JarvisX - Manager Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

        this.add(back);
        this.add(top);
        this.add(uname);
        this.add(pass);
        this.add(user);
        this.add(passw);
        this.add(mlogin);
        this.add(mexit);


    }

    LoginPanel(String emp){

        top = new JLabel();
        top.setText("JarvisX - Employee Login");
        top.setFont(new Font("Helvetica", Font.BOLD, 30));
        top.setBounds(400, 0, 500, 300);
        top.setForeground(new Color(0xFFFFFF));

        user = new JLabel();
        user.setText("Enter Username");
        user.setFont(new Font("Helvetica", Font.PLAIN, 20));
        user.setBounds(330, 115, 500, 300);
        user.setForeground(new Color(0xFFFFFF));

        uname = new JTextField();
        uname.setVisible(true);
        uname.setBounds(500, 250, 300, 30);
        uname.setBackground(new Color(0x333333));
        uname.setForeground(new Color(0xFFFFFF));
        uname.setPreferredSize(new Dimension(290, 25));
        uname.setBorder(BorderFactory.createLineBorder(new Color(0x2ECC71)));

        passw = new JLabel();
        passw.setText("Enter Password");
        passw.setFont(new Font("Helvetica", Font.PLAIN, 20));
        passw.setBounds(330, 165, 500, 300);
        passw.setForeground(new Color(0xFFFFFF));

        pass = new JPasswordField();
        pass.setVisible(true);
        pass.setBounds(500, 300, 300, 30);
        pass.setBackground(new Color(0x333333));
        pass.setForeground(new Color(0xFFFFFF));
        pass.setBorder(BorderFactory.createLineBorder(new Color(0x2ECC71)));

        elogin = new JButton();
        elogin.setFocusable(false);
        elogin.setText("Login");
        elogin.setFont(new Font("Sans Serif", Font.BOLD, 15));
        elogin.setBackground(new Color(0x2ECC71));
        elogin.setBounds(660, 360, 140, 40);
        elogin.setForeground(new Color(0xFFFFFF));
        elogin.setBorder(null);
        elogin.addActionListener(this);

        eexit = new JButton();
        eexit.setFocusable(false);
        eexit.setText("Exit");
        eexit.setFont(new Font("Sans Serif", Font.BOLD, 15));
        eexit.setBackground(new Color(0x181818));
        eexit.setBounds(500, 360, 140, 40);
        eexit.setForeground(new Color(0xFFFFFF));
        eexit.setBorder(BorderFactory.createLineBorder(new Color(0x2ECC71)));
        eexit.addActionListener(this);

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0x2ECC71)));
        back.addActionListener(this);

        this.setLayout(null);
        this.setTitle("JarvisX - Employee Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

        this.add(back);
        this.add(top);
        this.add(uname);
        this.add(pass);
        this.add(user);
        this.add(passw);
        this.add(elogin);
        this.add(eexit);


    }

    LoginPanel(float cl){

        top = new JLabel();
        top.setText("JarvisX - Client Login");
        top.setFont(new Font("Helvetica", Font.BOLD, 30));
        top.setBounds(400, 0, 500, 300);
        top.setForeground(new Color(0xFFFFFF));

        user = new JLabel();
        user.setText("Enter Username");
        user.setFont(new Font("Helvetica", Font.PLAIN, 20));
        user.setBounds(330, 115, 500, 300);
        user.setForeground(new Color(0xFFFFFF));

        uname = new JTextField();
        uname.setVisible(true);
        uname.setBounds(500, 250, 300, 30);
        uname.setBackground(new Color(0x333333));
        uname.setForeground(new Color(0xFFFFFF));
        uname.setPreferredSize(new Dimension(290, 25));
        uname.setBorder(BorderFactory.createLineBorder(new Color(0xB557F6)));

        passw = new JLabel();
        passw.setText("Enter Password");
        passw.setFont(new Font("Helvetica", Font.PLAIN, 20));
        passw.setBounds(330, 165, 500, 300);
        passw.setForeground(new Color(0xFFFFFF));

        pass = new JPasswordField();
        pass.setVisible(true);
        pass.setBounds(500, 300, 300, 30);
        pass.setBackground(new Color(0x333333));
        pass.setForeground(new Color(0xFFFFFF));
        pass.setBorder(BorderFactory.createLineBorder(new Color(0xB557F6)));

        clogin = new JButton();
        clogin.setFocusable(false);
        clogin.setText("Login");
        clogin.setFont(new Font("Sans Serif", Font.BOLD, 15));
        clogin.setBackground(new Color(0xB557F6));
        clogin.setBounds(660, 360, 140, 40);
        clogin.setForeground(new Color(0xFFFFFF));
        clogin.setBorder(null);
        clogin.addActionListener(this);

        cexit = new JButton();
        cexit.setFocusable(false);
        cexit.setText("Exit");
        cexit.setFont(new Font("Sans Serif", Font.BOLD, 15));
        cexit.setBackground(new Color(0x181818));
        cexit.setBounds(500, 360, 140, 40);
        cexit.setForeground(new Color(0xFFFFFF));
        cexit.setBorder(BorderFactory.createLineBorder(new Color(0xB557F6)));
        cexit.addActionListener(this);

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0xB557F6)));
        back.addActionListener(this);
        this.add(back);

        this.setLayout(null);
        this.setTitle("JarvisX - Client Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);


        this.add(top);
        this.add(uname);
        this.add(pass);
        this.add(user);
        this.add(passw);
        this.add(clogin);
        this.add(cexit);

    }

    public static int mgrn;

    @Override
    public void actionPerformed(ActionEvent a) {

        if (a.getSource() == mlogin) {
            Login l = new Login();

            if (l.mgrLogin(uname.getText(), String.valueOf(pass.getPassword())) == true) {
                this.dispose();
                MgrDashboard md = new MgrDashboard();
            }
            else if (n1<=1){
                this.dispose();
                box b = new box();
                b.WrongCredentialsMgr();
                n1=n1+1;

            }
            else{
                box b = new box();
                b.ExitBox();
            }

        }



        if (a.getSource()==elogin){

            Login l = new Login();

            if ( l.empLogin(uname.getText(), String.valueOf(pass.getText()))== true) {
                DataBase db = new DataBase();
                db.showEmpPro(uname.getText());
                this.dispose();
                EmpDashboard ed = new EmpDashboard();
            }

            else if (n1<=1){
                this.dispose();
                box b = new box();
                b.WrongCredentialsEmp();
                n1=n1+1;

            }
            else{
                box b = new box();
                b.ExitBox();
            }


        }
        if (a.getSource()==clogin){

            Login l = new Login();

            if (l.clLogin(uname.getText(), String.valueOf(pass.getPassword())) == true) {

                DataBase db = new DataBase();
                db.showClPro(uname.getText());
                this.dispose();
                ClDashboard cl = new ClDashboard();


            }

            else if (n1<=1){
                this.dispose();
                box b = new box();
                b.WrongCredentialsCL();
                n1=n1+1;

            }
            else{
                box b = new box();
                b.ExitBox();
            }


        }

        else if (a.getSource()==mexit){

            System.exit(0);


        }
        else if (a.getSource()==eexit){

            System.exit(0);


        }
        else if (a.getSource()==cexit){

            System.exit(0);


        }
        else if (a.getSource()==back){

            this.dispose();
            WelcSc ws = new WelcSc();
            n1=0;

        }

    }

}
