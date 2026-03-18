package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public interface SLLInterface {
    public boolean isEmpty();
    public int size();
    public Issue get(int index);
    public void remove(int index);
    public void add(Issue iss, int index);
    public void add(Issue iss);
    @Override
    public String toString();
}
