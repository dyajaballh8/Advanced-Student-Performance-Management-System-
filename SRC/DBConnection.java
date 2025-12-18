package ada.projectfinal;
import java.sql.*;
public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentPerformanceDB;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
        return DriverManager.getConnection(url);
    }
}
