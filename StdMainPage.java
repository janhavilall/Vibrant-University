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

public class StdMainPage extends JFrame implements ActionListener {
    StdMainPage() {

        JLabel n1heading = new JLabel("Welcome To Vibrant University");
        n1heading.setBounds(550, 35, 500, 50);
        n1heading.setFont(new Font("serif", Font.BOLD, 35));
        add(n1heading);

        this.setSize(1540, 850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        this.add(image);

        JMenuBar mb = new JMenuBar();
        JMenu newAdmission = new JMenu("Admission");
        newAdmission.setForeground(Color.blue);
        mb.add(newAdmission);
        JMenuItem applyInfo = new JMenuItem("Apply");
        applyInfo.setBackground(Color.WHITE);
        applyInfo.addActionListener(this);
        newAdmission.add(applyInfo);

        JMenuBar mb1 = new JMenuBar();
        JMenu courses = new JMenu("Courses");
        courses.setForeground(Color.red);
        mb.add(courses);
        JMenuItem avcourse = new JMenuItem("Courses Available");
        avcourse.setBackground(Color.WHITE);
        avcourse.addActionListener(this);
        courses.add(avcourse);



        JMenu sfee = new JMenu("Fee Details");
        sfee.setForeground(Color.blue);
        mb.add(sfee);
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        sfee.add(feestructure);
        JMenuItem feeform = new JMenuItem("Pay fees");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        sfee.add(feeform);

        JMenu about = new JMenu("About Us");
        about.setForeground(Color.red);
        mb.add(about);
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.blue);
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
        }  else if (msg.equals("Apply")) {
            new StdApply();
        } else if (msg.equals("Courses Available")) {
            new StdCourses();
        } else if (msg.equals("Fee Structure")) {
            new FeesStructure();
        }else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Fee Structure")) {
            new FeesStructure();
        }else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Pay fees")) {
            new StdFeeForm();
        }

    }

    public static void main(String[] args) {

        new StdMainPage();
    }
}
