package ada.projectfinal;
public class Enrollment {
    private int enrollmentId;
    private Student student;
    private Course course;
    private double score;
    public Enrollment(int id, Student s, Course c, double score) {
        this.enrollmentId = id; this.student = s; this.course = c; this.score = score;
    }
}
