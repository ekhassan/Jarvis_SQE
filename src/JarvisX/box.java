package JarvisX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class box extends JFrame implements ActionListener{
    JLabel top;
    JLabel top2;
    JButton ok;
    JButton ok2;
    JTextField r1;
    JLabel top3;
    JButton ok3;
    JTextField asto;
    JLabel top4;
    JButton ok4;
    JLabel top6;
    JButton ok6;
    JLabel top7;
    JButton ok7;

    JButton oke;
    JButton okc;
    JLabel tope;
    JLabel topc;

    JLabel top8;
    JTextField r2;
    JTextField asto1;
    JButton ok8;
    public static int n;
     public void WrongCredentialsMgr(){

        n=0;
         top = new JLabel();
         top.setText("<html>"+"Wrong Credentials "+"<br />"+"  Please Try Again"+"</html");
         top.setFont(new Font("Helvetica", Font.BOLD, 15));
         top.setBounds(120, 10, 300, 100);
         top.setForeground(new Color(0xFFFFFF));

         ok = new JButton();
         ok.setFocusable(false);
         ok.setText("Retry");
         ok.setFont(new Font("Sans Serif", Font.BOLD, 15));
         ok.setBackground(new Color(0x4F64FB));
         ok.setBounds(120, 100, 140, 40);
         ok.setForeground(new Color(0xFFFFFF));
         ok.setBorder(null);
         ok.addActionListener(this);

         this.add(ok);
         this.add(top);
         this.setLayout(null);
         this.setTitle("JarvisX - Login");
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setSize(400, 200);
         this.setVisible(true);
         this.setResizable(false);
         this.setVisible(true);
         this.getContentPane().setBackground(new Color(0x181818));
         this.setLocationRelativeTo(null);


     }

    public void WrongCredentialsEmp(){

        n=0;
        tope = new JLabel();
        tope.setText("<html>"+"Wrong Credentials "+"<br />"+"  Please Try Again"+"</html");
        tope.setFont(new Font("Helvetica", Font.BOLD, 15));
        tope.setBounds(120, 10, 300, 100);
        tope.setForeground(new Color(0xFFFFFF));

        oke = new JButton();
        oke.setFocusable(false);
        oke.setText("Retry");
        oke.setFont(new Font("Sans Serif", Font.BOLD, 15));
        oke.setBackground(new Color(0x4F64FB));
        oke.setBounds(120, 100, 140, 40);
        oke.setForeground(new Color(0xFFFFFF));
        oke.setBorder(null);
        oke.addActionListener(this);

        this.add(oke);
        this.add(tope);
        this.setLayout(null);
        this.setTitle("JarvisX - Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);


    }

    public void WrongCredentialsCL(){

        n=0;
        topc = new JLabel();
        topc.setText("<html>"+"Wrong Credentials "+"<br />"+"  Please Try Again"+"</html");
        topc.setFont(new Font("Helvetica", Font.BOLD, 15));
        topc.setBounds(120, 10, 300, 100);
        topc.setForeground(new Color(0xFFFFFF));

        okc = new JButton();
        okc.setFocusable(false);
        okc.setText("Retry");
        okc.setFont(new Font("Sans Serif", Font.BOLD, 15));
        okc.setBackground(new Color(0x4F64FB));
        okc.setBounds(120, 100, 140, 40);
        okc.setForeground(new Color(0xFFFFFF));
        okc.setBorder(null);
        okc.addActionListener(this);

        this.add(okc);
        this.add(topc);
        this.setLayout(null);
        this.setTitle("JarvisX - Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);


    }

    public void ExitBox(){

        top2 = new JLabel();
        top2.setText("<html>"+"Too Many Unsuccessful "+"<br />"+"  Tries. Exiting System."+"</html");
        top2.setFont(new Font("Helvetica", Font.BOLD, 15));
        top2.setBounds(120, 10, 300, 100);
        top2.setForeground(new Color(0xFFFFFF));

        ok2 = new JButton();
        ok2.setFocusable(false);
        ok2.setText("Exit");
        ok2.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok2.setBackground(new Color(0x4F64FB));
        ok2.setBounds(120, 100, 140, 40);
        ok2.setForeground(new Color(0xFFFFFF));
        ok2.setBorder(null);
        ok2.addActionListener(this);

        this.add(ok2);
        this.add(top2);
        this.setLayout(null);
        this.setTitle("JarvisX - Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    public void ProAdded(){

        top4 = new JLabel();
        top4.setText("Project Added Successfully.");
        top4.setFont(new Font("Helvetica", Font.BOLD, 15));
        top4.setBounds(90, 10, 300, 100);
        top4.setForeground(new Color(0xFFFFFF));

        ok4 = new JButton();
        ok4.setFocusable(false);
        ok4.setText("OK");
        ok4.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok4.setBackground(new Color(0x4F64FB));
        ok4.setBounds(120, 100, 140, 40);
        ok4.setForeground(new Color(0xFFFFFF));
        ok4.setBorder(null);
        ok4.addActionListener(this);

        this.add(ok4);
        this.add(top4);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    public void EmpDeleted(){

        top7 = new JLabel();
        top7.setText("Employee Deleted Successfully.");
        top7.setFont(new Font("Helvetica", Font.BOLD, 15));
        top7.setBounds(90, 10, 300, 100);
        top7.setForeground(new Color(0xFFFFFF));

        ok7 = new JButton();
        ok7.setFocusable(false);
        ok7.setText("OK");
        ok7.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok7.setBackground(new Color(0x4F64FB));
        ok7.setBounds(120, 100, 140, 40);
        ok7.setForeground(new Color(0xFFFFFF));
        ok7.setBorder(null);
        ok7.addActionListener(this);

        this.add(ok7);
        this.add(top7);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }



    public void AssignPro(String proname){

        top3 = new JLabel();
        top3.setText("Enter Employee Username");
        top3.setFont(new Font("Helvetica", Font.BOLD, 15));
        top3.setBounds(200, 10, 300, 100);
        top3.setForeground(new Color(0xFFFFFF));

        String s=proname;

        r1 = new JTextField();
        r1.setVisible(true);
        r1.setBounds(200, 160, 300, 30);
        r1.setBackground(new Color(0x181818));
        r1.setForeground(new Color(0xFFFFFF));
        r1.setPreferredSize(new Dimension(290, 25));
        r1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        r1.setEditable(false);
        r1.setText(s);
        r1.setHorizontalAlignment(SwingConstants.CENTER);
        r1.setVisible(false);



        asto = new JTextField();
        asto.setVisible(true);
        asto.setBounds(150, 85, 300, 30);
        asto.setBackground(new Color(0x181818));
        asto.setForeground(new Color(0xFFFFFF));
        asto.setPreferredSize(new Dimension(290, 25));
        asto.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        asto.setHorizontalAlignment(SwingConstants.CENTER);


        ok3 = new JButton();
        ok3.setFocusable(false);
        ok3.setText("Assign");
        ok3.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok3.setBackground(new Color(0x4F64FB));
        ok3.setBounds(230, 170, 140, 40);
        ok3.setForeground(new Color(0xFFFFFF));
        ok3.setBorder(null);
        ok3.addActionListener(this);

        this.add(r1);
        this.add(asto);
        this.add(ok3);
        this.add(top3);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    public void Added(String s){

        top6 = new JLabel();
        top6.setText(s);
        top6.setFont(new Font("Helvetica", Font.BOLD, 15));
        top6.setBounds(90, 10, 300, 100);
        top6.setForeground(new Color(0xFFFFFF));

        ok6 = new JButton();
        ok6.setFocusable(false);
        ok6.setText("OK");
        ok6.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok6.setBackground(new Color(0x4F64FB));
        ok6.setBounds(120, 100, 140, 40);
        ok6.setForeground(new Color(0xFFFFFF));
        ok6.setBorder(null);
        ok6.addActionListener(this);

        this.add(ok6);
        this.add(top6);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    public void SetStatus(String proname){

        top8 = new JLabel();
        top8.setText("Enter Project Status");
        top8.setFont(new Font("Helvetica", Font.BOLD, 15));
        top8.setBounds(200, 10, 300, 100);
        top8.setForeground(new Color(0xFFFFFF));

        String s=proname;

        r2 = new JTextField();
        r2.setVisible(true);
        r2.setBounds(200, 160, 300, 30);
        r2.setBackground(new Color(0x181818));
        r2.setForeground(new Color(0xFFFFFF));
        r2.setPreferredSize(new Dimension(290, 25));
        r2.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        r2.setEditable(false);
        r2.setText(s);
        r2.setHorizontalAlignment(SwingConstants.CENTER);
        r2.setVisible(false);



        asto1 = new JTextField();
        asto1.setVisible(true);
        asto1.setBounds(150, 85, 300, 30);
        asto1.setBackground(new Color(0x181818));
        asto1.setForeground(new Color(0xFFFFFF));
        asto1.setPreferredSize(new Dimension(290, 25));
        asto1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        asto1.setHorizontalAlignment(SwingConstants.CENTER);


        ok8 = new JButton();
        ok8.setFocusable(false);
        ok8.setText("Set");
        ok8.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ok8.setBackground(new Color(0x4F64FB));
        ok8.setBounds(230, 170, 140, 40);
        ok8.setForeground(new Color(0xFFFFFF));
        ok8.setBorder(null);
        ok8.addActionListener(this);

        this.add(r2);
        this.add(asto1);
        this.add(ok8);
        this.add(top8);
        this.setLayout(null);
        this.setTitle("JarvisX");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setVisible(true);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x181818));
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent a){
        //MANAGER
        if (a.getSource()==ok) {
            this.dispose();
            LoginPanel l = new LoginPanel(0);
        }
        else if (a.getSource()==oke) {
            this.dispose();
            LoginPanel l = new LoginPanel("Employee");
        }
        else if (a.getSource()==okc) {
            this.dispose();
            LoginPanel l = new LoginPanel(2.0f);
        }
        else if (a.getSource()==ok2){
            System.exit(0);

        }
        else if (a.getSource()==ok3){
            DataBase db=new DataBase();
            db.AssignTo(r1.getText(), asto.getText());
            this.dispose();
            MgrDashboard md = new MgrDashboard();
            String a1;
            ProjectDetails pd=new ProjectDetails(String.valueOf(md.pro.getSelectedItem()));


        }
        else if (a.getSource()==ok8){
            DataBase db=new DataBase();
            db.SetStatus(r2.getText(), asto1.getText());
            this.dispose();
            EmpDashboard ed = new EmpDashboard();
            String a1;
            EmpProjectDetails epd=new EmpProjectDetails(String.valueOf(ed.pro.getSelectedItem()));


        }

        else if (a.getSource()==ok4){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }
        else if (a.getSource()==ok6){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }
        else if (a.getSource()==ok7){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }
    }
}
