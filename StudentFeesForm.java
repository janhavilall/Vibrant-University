package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentFeesForm extends JFrame implements ActionListener{

    JTextField labelcourse, labelsem, labelphone, labelemail, tfbranch,labelamount,labelname,labeldept,labelroll,labelfname,labelwords;

    JButton print;
    Choice crollno;

    StudentFeesForm() {

        setSize(900, 650);
        setLocation(350, 50);

        setLayout(null);

        JLabel heading = new JLabel("Student Fees Form");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
        add(heading);

        JLabel lblrollnumber = new JLabel("Roll No.");
        lblrollnumber.setBounds(50, 100, 100, 20);
        lblrollnumber.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollnumber);

        labelroll = new JTextField();
        labelroll.setBounds(200, 100, 150, 30);
        labelroll.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelroll);


        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        labelname = new JTextField();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelname);

        JLabel lblfname = new JLabel("Surname");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        labelfname = new JTextField();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelfname);

        JLabel lblsem = new JLabel("Semester");
        lblsem.setBounds(50, 200, 100, 30);
        lblsem.setFont(new Font("serif", Font.BOLD, 20));
        add(lblsem);

        labelsem = new JTextField();
        labelsem.setBounds(200, 200, 150, 30);
        labelsem.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelsem);

        JLabel lblc = new JLabel("Course");
        lblc.setBounds(400, 200, 200, 30);
        lblc.setFont(new Font("serif", Font.BOLD, 20));
        add(lblc);

        labelcourse = new JTextField();
        labelcourse.setBounds(600, 200, 150, 30);
        labelcourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelcourse);

        JLabel lbldept = new JLabel("Department");
        lbldept.setBounds(50, 250, 200, 30);
        lbldept.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldept);

        labeldept = new JTextField();
        labeldept.setBounds(200, 250, 150, 30);
        add(labeldept);

        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        labelphone = new JTextField();
        labelphone.setBounds(600, 250, 150, 30);
        add(labelphone);

        JLabel lblemail = new JLabel("Email ID");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        labelemail = new JTextField();
        labelemail.setBounds(200, 300, 150, 30);
        add(labelemail);


        JLabel lblamount = new JLabel("Amount ");
        lblamount.setBounds(400, 300, 200, 30);
        lblamount.setFont(new Font("serif", Font.BOLD, 20));
        add(lblamount);

        labelamount = new JTextField();
        labelamount.setBounds(600, 300, 150, 30);
        labelamount.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelamount);

        JLabel lblaw = new JLabel("Amount in words");
        lblaw.setBounds(50, 350, 200, 30);
        lblaw.setFont(new Font("serif", Font.BOLD, 20));
        add(lblaw);

        labelwords = new JTextField();
        labelwords.setBounds(200, 350, 150, 30);
        labelwords.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelwords);

        print = new JButton("Print");
        print.setBounds(400, 450, 100, 30);
        print.addActionListener(this);
        add(print);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == print) {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        new StudentFeesForm();
    }
}