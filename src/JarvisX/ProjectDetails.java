package JarvisX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ProjectDetails extends JFrame implements ActionListener{
    JLabel head;
    JButton bgl;

    JLabel name;
    JLabel id;
    JLabel source;
    JLabel from;
    JLabel to;
    JLabel status;
    JLabel rev;
    JLabel rate;

    JTextField name1;
    JTextField id1;
    JTextField source1;
    JTextField from1;
    JTextField to1;
    JTextField status1;
    JTextField rev1;
    JTextField rate1;
    JTextField rrrrr;
    JButton assto;
    JButton back;
ProjectDetails(){

}
    ProjectDetails(String proname){
        String r=proname;


        rrrrr = new JTextField();
        rrrrr.setVisible(true);
        rrrrr.setBounds(200, 160, 300, 30);
        rrrrr.setBackground(new Color(0x181818));
        rrrrr.setForeground(new Color(0xFFFFFF));
        rrrrr.setPreferredSize(new Dimension(290, 25));
        rrrrr.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        rrrrr.setEditable(false);
        rrrrr.setText(r);
        rrrrr.setHorizontalAlignment(SwingConstants.CENTER);
        rrrrr.setVisible(false);


        head = new JLabel();
        head.setText(proname);
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

        DataBase db=new DataBase();
        db.showproDetails(proname);
        String a=db.a;
        String b=db.b;
        String c=db.c;
        String d=db.d;
        String e=db.e;
        String f=db.f;
        String g=db.g;
        String h=db.h;

//DETAILS
        id = new JLabel();
        id.setText("ID");
        id.setFont(new Font("Helvetica", Font.PLAIN, 15));
        id.setBounds(100, 22, 500, 300);
        id.setForeground(new Color(0xFFFFFF));



        id1 = new JTextField();
        id1.setVisible(true);
        id1.setBounds(200, 160, 300, 30);
        id1.setBackground(new Color(0x181818));
        id1.setForeground(new Color(0xFFFFFF));
        id1.setPreferredSize(new Dimension(290, 25));
        id1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        id1.setText("");
        id1.setEditable(false);
        id1.setHorizontalAlignment(SwingConstants.CENTER);

        name = new JLabel();
        name.setText("Project Name");
        name.setFont(new Font("Helvetica", Font.PLAIN, 15));
        name.setBounds(700, 22, 500, 300);
        name.setForeground(new Color(0xFFFFFF));

        name1 = new JTextField();
        name1.setVisible(true);
        name1.setBounds(800, 160, 300, 30);
        name1.setBackground(new Color(0x181818));
        name1.setForeground(new Color(0xFFFFFF));
        name1.setPreferredSize(new Dimension(290, 25));
        name1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        name1.setText("");
        name1.setEditable(false);
        name1.setHorizontalAlignment(SwingConstants.CENTER);

        from = new JLabel();
        from.setText("Client");
        from.setFont(new Font("Helvetica", Font.PLAIN, 15));
        from.setBounds(100, 122, 500, 300);
        from.setForeground(new Color(0xFFFFFF));

        from1 = new JTextField();
        from1.setVisible(true);
        from1.setBounds(200, 260, 300, 30);
        from1.setBackground(new Color(0x181818));
        from1.setForeground(new Color(0xFFFFFF));
        from1.setPreferredSize(new Dimension(290, 25));
        from1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        from1.setText("");
        from1.setEditable(false);
        from1.setHorizontalAlignment(SwingConstants.CENTER);

        status = new JLabel();
        status.setText("Status");
        status.setFont(new Font("Helvetica", Font.PLAIN, 15));
        status.setBounds(100, 222, 500, 300);
        status.setForeground(new Color(0xFFFFFF));

        status1 = new JTextField();
        status1.setVisible(true);
        status1.setBounds(200, 360, 300, 30);
        status1.setBackground(new Color(0x181818));
        status1.setForeground(new Color(0xFFFFFF));
        status1.setPreferredSize(new Dimension(290, 25));
        status1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        status1.setText("");
        status1.setEditable(false);
        status1.setHorizontalAlignment(SwingConstants.CENTER);

        rate = new JLabel();
        rate.setText("Rating");
        rate.setFont(new Font("Helvetica", Font.PLAIN, 15));
        rate.setBounds(100, 322, 500, 300);
        rate.setForeground(new Color(0xFFFFFF));

        rate1 = new JTextField();
        rate1.setVisible(true);
        rate1.setBounds(200, 460, 300, 30);
        rate1.setBackground(new Color(0x181818));
        rate1.setForeground(new Color(0xFFFFFF));
        rate1.setPreferredSize(new Dimension(290, 25));
        rate1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        rate1.setText("");
        rate1.setEditable(false);
        rate1.setHorizontalAlignment(SwingConstants.CENTER);

        source = new JLabel();
        source.setText("Source");
        source.setFont(new Font("Helvetica", Font.PLAIN, 15));
        source.setBounds(700, 122, 500, 300);
        source.setForeground(new Color(0xFFFFFF));

        source1 = new JTextField();
        source1.setVisible(true);
        source1.setBounds(800, 260, 300, 30);
        source1.setBackground(new Color(0x181818));
        source1.setForeground(new Color(0xFFFFFF));
        source1.setPreferredSize(new Dimension(290, 25));
        source1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        source1.setText("");
        source1.setEditable(false);
        source1.setHorizontalAlignment(SwingConstants.CENTER);

        to = new JLabel();
        to.setText("Assigned To");
        to.setFont(new Font("Helvetica", Font.PLAIN, 15));
        to.setBounds(700, 222, 500, 300);
        to.setForeground(new Color(0xFFFFFF));

        to1 = new JTextField();
        to1.setVisible(true);
        to1.setBounds(800, 360, 300, 30);
        to1.setBackground(new Color(0x181818));
        to1.setForeground(new Color(0xFFFFFF));
        to1.setPreferredSize(new Dimension(290, 25));
        to1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        to1.setText("");
        to1.setEditable(false);
        to1.setHorizontalAlignment(SwingConstants.CENTER);

        rev = new JLabel();
        rev.setText("Review");
        rev.setFont(new Font("Helvetica", Font.PLAIN, 15));
        rev.setBounds(700, 322, 500, 300);
        rev.setForeground(new Color(0xFFFFFF));

        rev1 = new JTextField();
        rev1.setVisible(true);
        rev1.setBounds(800, 460, 300, 30);
        rev1.setBackground(new Color(0x181818));
        rev1.setForeground(new Color(0xFFFFFF));
        rev1.setPreferredSize(new Dimension(290, 25));
        rev1.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        rev1.setText("");
        rev1.setEditable(false);
        rev1.setHorizontalAlignment(SwingConstants.CENTER);

        assto = new JButton();
        assto.setFocusable(false);
        assto.setText("Assign To");
        assto.setFont(new Font("Sans Serif", Font.BOLD, 15));
        assto.setBackground(new Color(0x4F64FB));
        assto.setBounds(960, 580, 140, 40);
        assto.setForeground(new Color(0xFFFFFF));
        assto.setBorder(null);
        assto.addActionListener(this);

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0x4f64fb)));
        back.addActionListener(this);

        this.add(rrrrr);
        this.add(assto);
        this.add(back);
        this.add(source);
        this.add(source1);
        this.add(to);
        this.add(to1);
        this.add(rev);
        this.add(rev1);
        this.add(status1);
        this.add(rate1);
        this.add(from);
        this.add(from1);
        this.add(status);
        this.add(rate);
        this.add(id);
        this.add(id1);
        this.add(name);
        this.add(name1);
        this.add(head);
        this.add(bgl);
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

        if (a.getSource()==assto){
            this.dispose();
            box b = new box();
            b.AssignPro(rrrrr.getText());
        }
        else if (a.getSource()==back){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }

    }
}
