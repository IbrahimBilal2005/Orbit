package entity;

import java.time.LocalDateTime;

/**
 * Class representing a Task in the program.
 */
public class Task {
    private final String id;
    private final String title;
    private final String description;
    private final String assigneeUsername;
    private final LocalDateTime dueDate;
    private boolean isCompleted;

    public Task(String id, String title, String description, String assigneeUsername, LocalDateTime dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.assigneeUsername = assigneeUsername;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getAssigneeUsername() { return assigneeUsername; }
    public LocalDateTime getDueDate() { return dueDate; }
    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }
}
