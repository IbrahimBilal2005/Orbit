package entity;

/**
 * Abstract User class containing shared attributes and methods for all user types.
 */
public abstract class User {
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;

    protected User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}
