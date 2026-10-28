package zm.zut;

import java.time.LocalDate;

public abstract class User {
    private String id;
    private String name;
    private String phone;
    private LocalDate joinDate;

    public User(String id, String name, String phone, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    // Encapsulation: Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public LocalDate getJoinDate() { return joinDate; }

    // Polymorphism: Abstract methods to be implemented by subclasses
    public abstract String getRoleName();
    public abstract boolean canManageFunds();
}