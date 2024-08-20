package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 300, 250);
        add(image);

        JLabel heading = new JLabel("<html>Vibrant University</html>");
        heading.setBounds(50, 10, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JLabel about = new JLabel("<html>Welcome to Vibrant University. We offer many professional courses from Undergraduation to Ph.D.</html>");
        about.setBounds(50, 100, 300, 130);
        about.setFont(new Font("Tahoma", Font.PLAIN,20 ));
        add(about);

        JLabel name = new JLabel("Developed By:");
        name.setBounds(50, 250, 550, 30);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);

        JLabel n1 = new JLabel("Janhavi Lall, Aruna Kanet, Brijal Patel");
        n1.setBounds(50, 300, 550, 40);
        n1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(n1);

        JLabel contact = new JLabel("Contact: janhavilall@gmail.com");
        contact.setBounds(50, 350, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);

        JLabel address = new JLabel("Location: National Highway (NH) 50, Gandhinagar, Gujarat");
        address.setBounds(50, 400, 550, 40);
        address.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(address);

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}