package ada.projectfinal;
import java.awt.Color;
import javax.swing.JLabel;
public class AlertManager {
    public void updateAlertLabel(JLabel label, int attendedDays) {
        double percentage = ((double) attendedDays / 80) * 100;
        if (percentage < 75) {
            label.setText("Warning: Low Attendance (" + (int)percentage + "%)");
            label.setForeground(Color.RED);
        } else {
            label.setText("Attendance: Good (" + (int)percentage + "%)");
            label.setForeground(new Color(0, 150, 0));
        }
    }
}
