package ada.projectfinal;
public abstract class User {
    protected int userId;
    protected String name, password, role;
    public User(int userId, String name, String password, String role) {
        this.userId = userId; this.name = name; this.password = password; this.role = role;
    }
    public abstract void displayInfo();
    public int getUserId() { return userId; }
    public String getName() { return name; }
}
