package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public interface StackInterface {
    public boolean isEmpty();
    public int size();
    public void push(Issue i);
    public void pop();
    public Issue peek();
}
