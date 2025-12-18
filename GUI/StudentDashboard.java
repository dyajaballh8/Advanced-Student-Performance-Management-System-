package ada.projectfinal;
import javax.swing.*;
import java.awt.*;
public class StudentDashboard extends JFrame {
    public StudentDashboard(Student s) {
        setTitle("Student Dashboard"); setSize(500, 400); setLayout(new GridLayout(6, 1));
        add(new JLabel("Welcome: " + s.getName(), SwingConstants.CENTER));
        add(new JLabel("Major: " + s.getMajor(), SwingConstants.CENTER));
        add(new JLabel("GPA: " + s.getGpa(), SwingConstants.CENTER));
        JLabel alert = new JLabel("", SwingConstants.CENTER);
        new AlertManager().updateAlertLabel(alert, new AttendanceDAO().getAttendedDays(s.getUserId()));
        add(alert);
        JButton logout = new JButton("Logout"); logout.addActionListener(e -> { new LoginFrame().setVisible(true); dispose(); });
        add(logout); setLocationRelativeTo(null);
    }
}
