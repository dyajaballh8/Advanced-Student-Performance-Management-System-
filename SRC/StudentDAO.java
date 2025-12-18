package ada.projectfinal;
import java.sql.*;
public class StudentDAO {
    public Student validateLogin(String u, String p) {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT s.* FROM Students s JOIN Users u ON s.StudentID = u.UserID WHERE u.Username=? AND u.Password=?");
            ps.setString(1, u); ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return new Student(rs.getInt("StudentID"), rs.getString("Name"), "", rs.getString("Major"), rs.getDouble("GPA"), rs.getInt("TotalHours"), rs.getString("FacultyName"));
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }
}
