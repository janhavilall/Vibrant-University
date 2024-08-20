package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class StdRegistration extends JFrame implements ActionListener{

    JTextField tfname, tfpassword,tfcontact, tfemail, tfcity,tfstate;

    JLabel labelregid;

    JButton submit, cancel,slogin;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    StdRegistration() {

        setSize(750, 700);
        setLocation(450, 50);

        setLayout(null);

        JLabel heading = new JLabel("New Student Registration Form");
        heading.setBounds(180, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);


        JLabel lblrollno = new JLabel("Registration Id");
        lblrollno.setBounds(50, 100, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollno);

        labelregid = new JLabel("101"+first4);
        labelregid.setBounds(250, 100, 200, 30);
        labelregid.setFont(new Font("serif", Font.BOLD, 20));
        add(labelregid);

        JLabel lblname = new JLabel("Fullname");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(250, 150, 150, 30);
        add(tfname);


        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 200, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(250, 200, 150, 30);
        add(tfemail);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50, 250, 200, 30);
        lblpassword.setFont(new Font("serif", Font.BOLD, 20));
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(250, 250, 150, 30);
        add(tfpassword);

        JLabel lblcontact = new JLabel("Contact No.");
        lblcontact.setBounds(50, 300, 200, 30);
        lblcontact.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcontact);

        tfcontact = new JTextField();
        tfcontact.setBounds(250, 300, 150, 30);
        add(tfcontact);


        JLabel lblcity = new JLabel("City");
        lblcity.setBounds(50, 350, 200, 30);
        lblcity.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcity);

        tfcity = new JTextField();
        tfcity.setBounds(250, 350, 150, 30);
        add(tfcity);


        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(50, 400, 200, 30);
        lblstate.setFont(new Font("serif", Font.BOLD, 20));
        add(lblstate);

        tfstate = new JTextField();
        tfstate.setBounds(250, 400, 150, 30);
        add(tfstate);


        submit = new JButton("Register");
        submit.setBounds(150, 500, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(300, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        slogin = new JButton("Login");
        slogin.setBounds(450, 500, 120, 30);
        slogin.setBackground(Color.BLACK);
        slogin.setForeground(Color.WHITE);
        slogin.addActionListener(this);
        slogin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(slogin);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
              String regid = labelregid.getText();
            String name = tfname.getText();
            String email = tfemail.getText();
            String password = tfpassword.getText();
            String phone = tfcontact.getText();
            String city = tfcity.getText();
            String state = tfstate.getText();

            try {
                String query = "insert into stdregistration values('"+regid+"','"+name+"', '"+email+"', '"+password+"', '"+phone+"', '"+city+"', '"+state+"')";

                connection con = new connection();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Registered Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            if( ae.getSource()== slogin){ new StdLogin();
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StdRegistration();
    }
}