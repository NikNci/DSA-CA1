package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public interface SLLInterface {
    public boolean isEmpty();
    public int size();
    public Issue get(int index);
    public void remove();
    public void add(Issue iss, int index);
    @Override
    public String toString();
}
