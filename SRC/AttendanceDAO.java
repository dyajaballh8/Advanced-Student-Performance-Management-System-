package ada.projectfinal;
import java.sql.*;
public class AttendanceDAO {
    public int getAttendedDays(int id) {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT AttendedDays FROM Attendance WHERE StudentID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) { e.printStackTrace(); }
        return 0;
    }
}
