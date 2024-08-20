package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MainPage extends JFrame implements ActionListener {

    JButton StudentRegistration, StudentLogin, EmployeeLogin;
    MainPage() {
        setSize(800, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);


        JLabel nheading = new JLabel("Welcome To Vibrant University");
        nheading.setBounds(200, 30, 500, 50);
        nheading.setFont(new Font("serif", Font.BOLD, 30));
        add(nheading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 800, 500);
        add(image);

        JPanel header;
        header=new JPanel();
        header.setBackground(new Color(0,0,0,80));

        header.setBounds(0,0,800,500);
        JLabel heading=new JLabel("Welcome to Vibrant University");
        heading.setForeground(Color.BLACK);
        heading.setBounds(200,10,400,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        header .add(heading);

        JLabel about = new JLabel("Please select an appropriate button.");
        about.setBounds(210, 100, 400, 130);
        about.setFont(new Font("Tahoma", Font.BOLD,20 ));
        add(about);

        StudentRegistration = new JButton("Student Registration");
        StudentRegistration.setBounds(300, 200, 200, 30);
        StudentRegistration.setBackground(Color.black);
        StudentRegistration.setForeground(Color.white);
        StudentRegistration.addActionListener(this);
        StudentRegistration.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(StudentRegistration);

        StudentLogin = new JButton("Student Login");
        StudentLogin.setBounds(300, 250, 200, 30);
        StudentLogin.setBackground(Color.BLACK);
        StudentLogin.setForeground(Color.WHITE);
        StudentLogin.addActionListener(this);
        StudentLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(StudentLogin);

        EmployeeLogin = new JButton("Employee Login");
        EmployeeLogin.setBounds(300, 300, 200, 30);
        EmployeeLogin.setBackground(Color.BLACK);
        EmployeeLogin.setForeground(Color.WHITE);
        EmployeeLogin.addActionListener(this);
        EmployeeLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(EmployeeLogin);


        setLayout(null);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == StudentRegistration) {
            new StdRegistration();
        } else if (ae.getSource() == StudentLogin) {
            new StdLogin();
        } else if (ae.getSource() == EmployeeLogin) {
            new splash();

        } else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new MainPage();
    }
}