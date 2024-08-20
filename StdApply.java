package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class StdApply extends JFrame implements ActionListener{

    JTextField tfname, tffname, tfaddress, tfphone, tfemail;

    JDateChooser dcdob;
    JLabel labelapplyid;
    JComboBox cbcourse,cbapplied,exam,examstatus;
    JButton submit, cancel;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);


    StdApply() {

        setSize(900, 650);
        setLocation(350, 50);

        setLayout(null);

        JLabel heading = new JLabel("Student Application Form");
        heading.setBounds(250, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblrollno = new JLabel("Application Id");
        lblrollno.setBounds(50, 100, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollno);

        labelapplyid = new JLabel("202"+first4);
        labelapplyid.setBounds(200, 100, 200, 30);
        labelapplyid.setFont(new Font("serif", Font.BOLD, 20));
        add(labelapplyid);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel lblfname = new JLabel("Surame");
        lblfname.setBounds(450, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(50, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(450, 200, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 200, 150, 30);
        add(tfphone);

        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(450, 250, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(600, 250, 150, 30);
        add(tfemail);

        JLabel lblug = new JLabel("Applying For");
        lblug.setBounds(50, 300, 200, 30);
        lblug.setFont(new Font("serif", Font.BOLD, 20));
        add(lblug);

        String applied[] = {"None","Undergraduation","Postgraduation"};
        cbapplied = new JComboBox(applied);
        cbapplied.setBounds(200, 300, 150, 30);
        cbapplied.setBackground(Color.WHITE);
        add(cbapplied);

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(450, 300, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);

        String course[] = {"None","B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(600, 300, 150, 30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        JLabel lblexam = new JLabel("Exam Given ");
        lblexam.setBounds(50, 350, 200, 30);
        lblexam.setFont(new Font("serif", Font.BOLD, 20));
        add(lblexam);

        String examgiven[] = {"None","CMAT","JEE","CAT","GUJCAT","CUET","NIMCET","NMAT","NONE"};
        exam = new JComboBox(examgiven);
        exam.setBounds(200, 350, 150, 30);
        exam.setBackground(Color.WHITE);
        add(exam);

        JLabel lblstatus = new JLabel("Exam Status");
        lblstatus.setBounds(450, 350, 200, 30);
        lblstatus.setFont(new Font("serif", Font.BOLD, 20));
        add(lblstatus);

        String examst[] = {"None","Appearing this year","Appeared"};
        examstatus = new JComboBox(examst);
        examstatus.setBounds(600, 350, 150, 30);
        examstatus.setBackground(Color.WHITE);
        add(examstatus);


        submit = new JButton("Apply");
        submit.setBounds(250, 450, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 450, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String applyid = labelapplyid.getText();
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String applied=(String) cbapplied.getSelectedItem();
            String course = (String) cbcourse.getSelectedItem();
            String examgiven=(String) exam.getSelectedItem();
            String status=(String) examstatus.getSelectedItem();


            try {
                String query = "insert into applicationform values('"+applyid+"', '"+name+"', '"+fname+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+applied+"', '"+course+"', '"+examgiven+"','"+status+"')";

                connection con = new connection();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Your Application sent Successfully. Wait for a University call.");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StdApply();
    }
}