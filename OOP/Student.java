package ada.projectfinal;
public class Student extends User {
    private String major, facultyName;
    private double gpa;
    private int totalHours;
    public Student(int userId, String name, String password, String major, double gpa, int totalHours, String facultyName) {
        super(userId, name, password, "Student");
        this.major = major; this.gpa = gpa; this.totalHours = totalHours; this.facultyName = facultyName;
    }
    @Override public void displayInfo() { System.out.println("Student: " + name); }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getTotalHours() { return totalHours; }
    public String getFacultyName() { return facultyName; }
}
