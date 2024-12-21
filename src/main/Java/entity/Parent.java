package entity;

import java.util.List;

/**
 * Class representing a Parent in the program.
 */
public class Parent extends User {
    private final List<Child> children;

    public Parent(String username, String password, String firstName, String lastName, List<Child> children) {
        super(username, password, firstName, lastName);
        this.children = children;
    }

    public List<Child> getChildren() { return children; }
}
