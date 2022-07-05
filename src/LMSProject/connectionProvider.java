package LMSProject;
import java.sql.*;
/**
 *
 * @author Adib
 */
public class connectionProvider {
    public static Connection getConn()
    {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryms2","root","pc2llv2q");
           return conn;
       } catch(Exception e){
           System.out.println(e);
           return null;
       }
    }
}
