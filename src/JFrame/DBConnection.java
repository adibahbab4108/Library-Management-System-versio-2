package JFrame;

import java.sql.*;
/**
 *
 * @author Adib
 */
public class DBConnection {
    static Connection con=null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryms2","root","pc2llv2q");
        }catch(Exception e){
            e.printStackTrace();
        }
            return con;
    }
}
