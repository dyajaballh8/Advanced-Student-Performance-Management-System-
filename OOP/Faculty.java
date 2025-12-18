package ada.projectfinal;
public class Faculty extends User {
    private String department;
    public Faculty(int userId, String name, String password, String department) {
        super(userId, name, password, "Faculty");
        this.department = department;
    }
    @Override public void displayInfo() { System.out.println("Faculty: " + name); }
    public String getDepartment() { return department; }
}

