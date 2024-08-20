//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decomp

package university.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Project extends JFrame implements ActionListener {
    Project() {

        JLabel n2heading = new JLabel("Welcome To Vibrant University");
        n2heading.setBounds(550, 35, 500, 50);
        n2heading.setFont(new Font("serif", Font.BOLD, 35));
        add(n2heading);

        this.setSize(1540, 850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        this.add(image);
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        JMenuItem facultyInfo = new JMenuItem("New Staff Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        JMenuItem facultydetails = new JMenuItem("View Staff Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        JMenu exam = new JMenu("Applications");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        JMenuItem examinationdetails = new JMenuItem("Student Application");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        JMenuItem stdregistered = new JMenuItem("Student Registered");
        stdregistered.setBackground(Color.WHITE);
        stdregistered.addActionListener(this);
        exam.add(stdregistered);


        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        JMenuItem updatefacultyinfo = new JMenuItem("Update Staff Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        JMenuItem paidfee = new JMenuItem("Paid Fees Details");
        paidfee.setBackground(Color.WHITE);
        paidfee.addActionListener(this);
        fee.add(paidfee);

        JMenu about = new JMenu("About Us");
        about.setForeground(Color.BLUE);
        mb.add(about);
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        this.setJMenuBar(mb);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Exit")) {
            this.setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception var5) {
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception var4) {
            }
        } else if (msg.equals("New Staff Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Staff Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();

        }else if (msg.equals("Update Staff Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Fee Structure")) {
            new FeesStructure();
        }else if (msg.equals("About")) {
            new About();
        }else if (msg.equals("Student Application")) {
            new StdApplication();
        }else if (msg.equals("Student Registered")) {
            new StudentRegistered();
        }else if (msg.equals("Fee Structure")) {
            new FeesStructure();
        }else if (msg.equals("Paid Fees Details")) {
                new Paidfees();
        }else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeesForm();
        }

    }

    public static void main(String[] args) {

    new Project();
    }
}
