package ada.projectfinal;
import javax.swing.*;
import java.awt.*;
public class LoginFrame extends JFrame {
    private JTextField uF = new JTextField(15);
    private JPasswordField pF = new JPasswordField(15);
    public LoginFrame() {
        setTitle("Login"); setSize(450, 550); setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel bg = new JLabel(new ImageIcon("background.jpg"));
        bg.setLayout(new GridBagLayout()); setContentPane(bg);
        JPanel glass = new JPanel(new GridLayout(3, 2, 10, 10));
        glass.setBackground(new Color(255, 255, 255, 200));
        glass.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        glass.add(new JLabel("User:")); glass.add(uF);
        glass.add(new JLabel("Pass:")); glass.add(pF);
        JButton b = new JButton("Login"); glass.add(new JLabel()); glass.add(b);
        add(glass); setLocationRelativeTo(null);
        b.addActionListener(e -> {
            Student s = new StudentDAO().validateLogin(uF.getText(), new String(pF.getPassword()));
            if (s != null) { new StudentDashboard(s).setVisible(true); this.dispose(); }
            else { JOptionPane.showMessageDialog(this, "Wrong Credentials!"); }
        });
    }
}
