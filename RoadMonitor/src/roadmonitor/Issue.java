package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public class Issue {
    private String description;
    private int priority;

    public Issue(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
    
}
