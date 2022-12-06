package jarvis;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MgrDashboard extends JFrame  implements ActionListener {

    DataBase db = new DataBase();
    JButton bgl;
    JButton bgl1;
    JButton bgl2;
    JLabel h;
    JLabel h1;
    JComboBox pro;
    JButton det;
    JButton add;

    JLabel h2;
    JComboBox emp;
    JButton del;
    JButton addemp;
    JButton addcl;
    JButton back;
    public static String s;



    MgrDashboard() {

        h = new JLabel();
        h.setText("Welcome, Manager!");
        h.setFont(new Font("Helvetica", Font.BOLD, 30));
        h.setBounds(100,-105,500,300);
        h.setForeground(new Color(0xffffff));

        bgl = new JButton();
        bgl.setFont(new Font("Sans Serif", Font.BOLD,10));
        bgl.setBackground(new Color(0x4F64FB));
        bgl.setBounds(100,80,100,3);
        bgl.setForeground(new Color(0x333333));
        bgl.setBorder(null);
        bgl.setRolloverEnabled(false);
        bgl.setVisible(true);

        bgl1 = new JButton();
        bgl1.setFont(new Font("Sans Serif", Font.BOLD,10));
        bgl1.setBackground(new Color(0xff0033));
        bgl1.setBounds(210,210,20,3);
        bgl1.setForeground(new Color(0x333333));
        bgl1.setBorder(null);
        bgl1.setRolloverEnabled(false);
        bgl1.setVisible(true);

        h1 = new JLabel();
        h1.setText("Projects");
        h1.setFont(new Font("Helvetica", Font.BOLD, 22));
        h1.setBounds(210,40,550,300);
        h1.setForeground(new Color(0xffffff));

        db.showProjects();
        pro = new JComboBox(db.dbprojects);
        pro.addActionListener(this);
        pro.setBounds(210,250,200,40);
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

        add = new JButton();
        add.setFocusable(false);
        add.setText("Add Project");
        add.setFont(new Font("Sans Serif", Font.BOLD, 15));
        add.setBackground(new Color(0xDC7633));
        add.setBounds(590, 250, 140, 40);
        add.setForeground(new Color(0xFFFFFF));
        add.setBorder(null);
        add.addActionListener(this);


        h2 = new JLabel();
        h2.setText("Employees");
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

        db.showEmps();
        emp = new JComboBox(db.dbemps);
        emp.addActionListener(this);
        emp.setBounds(210,450,200,40);
        emp.setBackground(new Color(0xc2f2fc));
        emp.setForeground(new Color(0x111111));
        emp.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));

        del = new JButton();
        del.setFocusable(false);
        del.setText("Delete Employee");
        del.setFont(new Font("Sans Serif", Font.BOLD, 15));
        del.setBackground(new Color(0x4F64FB));
        del.setBounds(430, 450, 140, 40);
        del.setForeground(new Color(0xFFFFFF));
        del.setBorder(null);
        del.addActionListener(this);

        addemp = new JButton();
        addemp.setFocusable(false);
        addemp.setText("Add Employee");
        addemp.setFont(new Font("Sans Serif", Font.BOLD, 15));
        addemp.setBackground(new Color(0xDC7633));
        addemp.setBounds(590, 450, 140, 40);
        addemp.setForeground(new Color(0xFFFFFF));
        addemp.setBorder(null);
        addemp.addActionListener(this);

        addcl = new JButton();
        addcl.setFocusable(false);
        addcl.setText("Add Client");
        addcl.setFont(new Font("Sans Serif", Font.BOLD, 15));
        addcl.setBackground(new Color(0xDC7633));
        addcl.setBounds(750, 250, 140, 40);
        addcl.setForeground(new Color(0xFFFFFF));
        addcl.setBorder(null);
        addcl.addActionListener(this);

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

        this.add(addcl);
        this.add(h2);
        this.add(addemp);
        this.add(del);
        this.add(emp);
        this.add(bgl2);
        this.add(det);
        this.add(add);
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
    @Override
    public void actionPerformed(ActionEvent a){
        //MANAGER
        if (a.getSource()==det){

            this.dispose();
            String s;
            s=String.valueOf(pro.getSelectedItem());
            ProjectDetails pd = new ProjectDetails(s);
        }

        if (a.getSource()==add){

            this.dispose();
            AddNPro anp = new AddNPro();
        }
        if (a.getSource()==del){

            this.dispose();
            DataBase db = new DataBase();
            String l;
            l=String.valueOf(emp.getSelectedItem());
            db.delDBEmp(l);
            box b = new box();
            b.EmpDeleted();


        }
        if (a.getSource()==addemp){
            AddNEmp ane = new AddNEmp();
            this.dispose();

        }
        if (a.getSource()==addcl){
            AddNCl anc = new AddNCl();
            this.dispose();

        }
        else if (a.getSource()==back){

            this.dispose();
            LoginPanel lp = new LoginPanel(1);

        }

    }
}

