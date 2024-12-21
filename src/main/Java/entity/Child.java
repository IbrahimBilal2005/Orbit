package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Child in the program.
 */
public class Child extends User {
    private final List<Task> pendingTasks;
    private final List<Task> completedTasks;
    private final Integer points;

    public Child(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        this.pendingTasks = new ArrayList<>();
        this.completedTasks = new ArrayList<>();
        this.points = 0;
    }

    public List<Task> getPendingTasks() { return pendingTasks; }
    public List<Task> getCompletedTasks() { return completedTasks; }
    public Integer getPoints() { return points; }
}
