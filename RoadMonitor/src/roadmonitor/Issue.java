package roadmonitor;

/**
 *
 * @author Nikolas Misins
 * The issue class is a kind of object that actually holds data pertaining to traffic. It holds its own priority
 * key so some aspects of the PriorityQueue class may differ in terms of how Nodes are created, but what is 
 * important is that the priority queue is still it's the ADT it is.
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
