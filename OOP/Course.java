package ada.projectfinal;
public class Course {
    private int courseId, creditHours;
    private String courseCode, courseName;
    public Course(int id, String code, String name, int hours) {
        this.courseId = id; this.courseCode = code; this.courseName = name; this.creditHours = hours;
    }
    public String getCourseName() { return courseName; }
}
