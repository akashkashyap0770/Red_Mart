package DB;
import java.sql.*;
public class DBCon {

    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;

    public DBCon() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/redmart", "root", "ak@5743");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
