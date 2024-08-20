package university.management.system;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StdCourses extends JFrame{
     JFrame f;
     JTable j;
    StdCourses()
    {
        f = new JFrame();
        f.setTitle("Courses");
        String[][] data = {
                { "BTech" , "280000"},
                { "MTech", "210000"},
                { "MCA", "410000"},
                { "BE", "410000"},
                { "BCA", "260000"},
                { "BBA", "150000"},
                { "MBA", "335000"},
                { "BCom", "120000"},
                { "MA", "110000"},
                { "BA", "120000"},
                { "Ph.D", "270000"},
        };

        String[] columnNames = { "Course Name", "Total fees"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 500);
        f.setLocation(450,50);
        // Frame Visible = true
        f.setVisible(true);
    }

    // Driver method
    public static void main(String[] args)
    {
        new StdCourses();
    }
}
