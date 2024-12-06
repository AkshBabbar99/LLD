package LibraryManagement;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;

    public User(){
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user){
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String generateUniqueId(){
        return "0";
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
