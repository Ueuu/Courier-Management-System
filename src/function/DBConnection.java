package function;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
    private static final String username ="root";
    private static final String password = "8055";
    private static final String conn ="jdbc:mysql://localhost:3306/courier?autoReconnect=true&useSSL=false";
     
    public static java.sql.Connection getConnection() throws SQLException {
         return DriverManager.getConnection(conn , username ,password);
     }

}
