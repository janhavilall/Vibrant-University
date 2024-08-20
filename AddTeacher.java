package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener{

    JTextField tfname, tffname, tfaddress, tfphone, tfemail,tfqualiper, tfexperience;
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbpost, cbbranch,cbqualified;
    JButton submit, cancel;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddTeacher() {

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);

        JLabel heading = new JLabel("New Staff Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel lblfname = new JLabel("Surname");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel lblempId = new JLabel("Employee Id");
        lblempId.setBounds(50, 200, 200, 30);
        lblempId.setFont(new Font("serif", Font.BOLD, 20));
        add(lblempId);

        labelempId = new JLabel("101"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelempId);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lblx = new JLabel("Qualification");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add(lblx);

        String qualified[] = {"B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA","Ph.D","MTech"};
        cbqualified = new JComboBox(qualified);
        cbqualified.setBounds(600, 300, 150, 30);
        cbqualified.setBackground(Color.WHITE);
        add(cbqualified);

        JLabel quali_per = new JLabel("Qualification (%)");
        quali_per.setBounds(50, 350, 200, 30);
        quali_per.setFont(new Font("serif", Font.BOLD, 20));
        add(quali_per);

        tfqualiper = new JTextField();
        tfqualiper.setBounds(200, 350, 150, 30);
        add(tfqualiper);

        JLabel lblex = new JLabel("Work Experience");
        lblex.setBounds(400, 350, 200, 30);
        lblex.setFont(new Font("serif", Font.BOLD, 20));
        add(lblex);

        tfexperience = new JTextField();
        tfexperience.setBounds(600, 350, 150, 30);
        add(tfexperience);

        JLabel lblpost = new JLabel("Job Post");
        lblpost.setBounds(50, 400, 200, 30);
        lblpost.setFont(new Font("serif", Font.BOLD, 20));
        add(lblpost);

        String course[] = {"Temporary Faculty", "Assisstant Faculty", "Professor", "Clerk", "Peon"};
        cbpost = new JComboBox(course);
        cbpost.setBounds(200, 400, 150, 30);
        cbpost.setBackground(Color.WHITE);
        add(cbpost);

        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lblbranch);

        String branch[] = {"Computer Science","Computer Application", "Social Science","Electronics", "Mechanical", "Civil", "IT","Literature","Office"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String empId = labelempId.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String qualification = (String) cbqualified.getSelectedItem();
            String quali_per = tfqualiper.getText();
            String experience = tfexperience.getText();
            String post = (String) cbpost.getSelectedItem();
            String dept = (String) cbbranch.getSelectedItem();

            try {
                String query = "insert into staff values('"+empId+"','"+name+"', '"+fname+"','"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+qualification+"', '"+quali_per+"', '"+experience+"', '"+post+"', '"+dept+"')";

                connection con = new connection();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddTeacher();
    }
}