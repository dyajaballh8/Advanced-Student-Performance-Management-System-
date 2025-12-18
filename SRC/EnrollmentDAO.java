package ada.projectfinal;
import java.sql.*;
import java.util.*;
public class EnrollmentDAO {
    public List<String[]> getGrades(int id) {
        List<String[]> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT c.CourseName, e.Score FROM Enrollments e JOIN Courses c ON e.CourseID = c.CourseID WHERE e.StudentID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) list.add(new String[]{rs.getString(1), rs.getString(2)});
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
}
