package jarvis;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AddNPro extends JFrame implements ActionListener {

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
    JButton addPro;
    JButton back;

    AddNPro(){


        head = new JLabel();
        head.setText("Add New Project");
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
        id1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

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
        name1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

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
        from1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

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
        status1.setForeground(new Color(0xcdcdcd));
        status1.setPreferredSize(new Dimension(290, 25));
        status1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        status1.setEditable(false);
        status1.setText("Incomplete");

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
        rate1.setForeground(new Color(0xcdcdcd));
        rate1.setPreferredSize(new Dimension(290, 25));
        rate1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        rate1.setText("Pending");
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
        source1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

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
        to1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));

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
        rev1.setForeground(new Color(0xcdcdcd));
        rev1.setPreferredSize(new Dimension(290, 25));
        rev1.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        rev1.setText("Pending");
        rev1.setHorizontalAlignment(SwingConstants.CENTER);
        rev1.setEditable(false);

        addPro = new JButton();
        addPro.setFocusable(false);
        addPro.setText("Add Project");
        addPro.setFont(new Font("Sans Serif", Font.BOLD, 15));
        addPro.setBackground(new Color(0xDC7633));
        addPro.setBounds(960, 580, 140, 40);
        addPro.setForeground(new Color(0xFFFFFF));
        addPro.setBorder(null);
        addPro.addActionListener(this);

        back = new JButton();
        back.setFocusable(false);
        back.setText("Back");
        back.setFont(new Font("Sans Serif", Font.BOLD, 15));
        back.setBackground(new Color(0x181818));
        back.setBounds(800, 580, 140, 40);
        back.setForeground(new Color(0xFFFFFF));
        back.setBorder(BorderFactory.createLineBorder(new Color(0xDC7633)));
        back.addActionListener(this);


        this.add(addPro);
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
        if (a.getSource()==addPro){
            this.dispose();
            DataBase db = new DataBase();
            db.addDBPro(id1.getText(), name1.getText(),source1.getText(),from1.getText(),to1.getText());
            box b = new box();
            b.ProAdded();

        }
        else if (a.getSource()==back){
            this.dispose();
            MgrDashboard md = new MgrDashboard();


        }

    }
}
