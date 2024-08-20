package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

public class StdFeeForm extends JFrame implements ActionListener {

    //Choice crollno;
    JComboBox cbcourse, cbbranch, cbsemester;
    JLabel labeltotal,labelpayid;
    JTextField labelpnr, labelsname,labelfname;
    JButton update, pay, back;
    Choice crollno;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    StdFeeForm() {
        setSize(950, 600);
        setLocation(300, 100);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 500, 300);
        add(image);

        JLabel heading = new JLabel("Student Fees Form");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
        add(heading);

        JLabel lblpayid = new JLabel("Payment Id");
        lblpayid.setBounds(40, 100, 200, 30);
        lblpayid.setFont(new Font("serif", Font.BOLD, 20));
        add(lblpayid);

        labelpayid = new JLabel("400"+first4);
        labelpayid.setBounds(200, 100, 200, 30);
        labelpayid.setFont(new Font("serif", Font.BOLD, 20));
        add(labelpayid);

        JLabel lblrollnumber = new JLabel("Select Roll No");
        lblrollnumber.setBounds(40, 150, 150, 20);
        lblrollnumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblrollnumber);

        crollno = new Choice();
        crollno.setBounds(200, 150, 150, 20);
        add(crollno);

        try {
            connection c = new connection();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40, 200, 150, 20);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(200, 200, 150, 20);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelname);

        JLabel lblfname = new JLabel("Surname");
        lblfname.setBounds(40, 250, 150, 20);
        lblfname.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblfname);

        JLabel labelfname = new JLabel();
        labelfname.setBounds(200, 250, 150, 20);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelfname);

        try {
            connection c = new connection();
            String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("surname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    connection c = new connection();
                    String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        labelname.setText(rs.getString("name"));
                        labelfname.setText(rs.getString("surname"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

//        JLabel lblname = new JLabel("Name");
//        lblname.setBounds(40, 200, 100, 30);
//        lblname.setFont(new Font("Tahoma", Font.BOLD, 16));
//        add(lblname);
//
//        labelfname = new JTextField();
//        labelfname.setBounds(200, 200, 150, 30);
//        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(labelfname);
//
//
//        JLabel lblfname = new JLabel("Surname");
//        lblfname.setBounds(40, 250, 200, 30);
//        lblfname.setFont(new Font("Tahoma", Font.BOLD, 16));
//        add(lblfname);
//
//        labelsname = new JTextField();
//        labelsname.setBounds(200, 250, 150, 30);
//        labelsname.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(labelsname);

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(40, 300, 250, 20);
        lblcourse.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblcourse);

        String course[] = {"Btech", "BBA", "BCA", "Bsc", "Msc","Mtech", "MBA", "MCA", "MCom", "MA", "BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 300, 150, 25);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(40, 350, 150, 20);
        lblbranch.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblbranch);

        String branch[] = {"Computer Science","Computer Application", "Electronics", "Mechanical", "Civil", "IT","Management",
                "English Literature","Hindi Literature","Social Science"};;
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(200, 350, 150, 25);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        JLabel lblsemester = new JLabel("Semester");
        lblsemester.setBounds(40, 400, 150, 20);
        lblsemester.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblsemester);

        String semester[] = {"sem1", "sem2", "sem3", "sem4", "sem5", "sem6", "sem7", "sem8" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(200, 400, 150, 25);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);

        JLabel lbltotal = new JLabel("Total Amount");
        lbltotal.setBounds(40, 450, 150, 20);
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lbltotal);

        labeltotal = new JLabel();
        labeltotal.setBounds(200, 450, 150, 20);
        labeltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labeltotal);

        update = new JButton("Show Fees");
        update.setBounds(30, 500, 100, 25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        pay = new JButton("Pay Fee");
        pay.setBounds(150, 500, 100, 25);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(pay);

        back = new JButton("Cancel");
        back.setBounds(270, 500, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == update) {
            String course = (String) cbcourse.getSelectedItem();
            String semester = (String) cbsemester.getSelectedItem();
            try {
                connection c = new connection();
                ResultSet rs = c.s.executeQuery("select * from fee where course_Name = '" + course + "'");
                while (rs.next()) {
                    labeltotal.setText(rs.getString(semester));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == pay) {
            if (ae.getSource() == pay) {
                String payId=labelpayid.getText();
                String rollno = crollno.getSelectedItem();
//                String name = labelfname.getText();
//                String surname = labelsname.getText();
                String course = (String) cbcourse.getSelectedItem();
                String branch = (String) cbbranch.getSelectedItem();
                String semester = (String) cbsemester.getSelectedItem();
                String amount=labeltotal.getText();


                try {
                    String query = "insert into collegefees values('" + payId + "','" + rollno + "','" + course + "', '" + branch + "', '" + semester + "','"+amount+"')";

                    connection con = new connection();
                    con.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "College fee submitted successfully");

                } catch (Exception e) {
                    e.printStackTrace();
                }



            } else {
                setVisible(false);
            }
        }
    }
    public static void main(String[] args) {
        new StdFeeForm();
    }
}