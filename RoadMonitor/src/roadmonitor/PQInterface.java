package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public interface PQInterface {
    public void enqueue(Issue iss);
    public void dequeue();
    public int size();
    public boolean isEmpty();
    @Override
    public String toString();
}
