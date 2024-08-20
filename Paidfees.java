package university.management.system;



import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Paidfees extends JFrame {

    Paidfees() {
        setSize(1000, 700);
        setLocation(250, 50);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Paid Fees details ");
        heading.setBounds(50, 10, 400, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JTable table = new JTable();

        try {
            connection c = new connection();
            ResultSet rs = c.s.executeQuery("select * from collegefees");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }


        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 60, 1000, 700);
        add(jsp);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Paidfees();
    }
}

