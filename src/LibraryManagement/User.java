package LibraryManagement;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User(){
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user){
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    private final String generateUniqueId(){
        totalUsers++;
        return "User-" + totalUsers;
    }

    private int getTotalUsers(){
        return totalUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
