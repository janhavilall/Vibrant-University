package university.management.system;

import java.sql.*;
public class connection {

    Statement s;
    connection(){

        Connection c;
        //Statement s;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///university","root","1234abc");
            s=c.createStatement();
        }catch (Exception e){

            e.printStackTrace();
        }
    }


}
