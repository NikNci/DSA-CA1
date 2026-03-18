package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public class PriorityQueue implements PQInterface{
    private SinglyLinkedList theList;

    public PriorityQueue() {
        theList = new SinglyLinkedList();
    }
    
    @Override
    public void enqueue(Issue iss) {
        theList.add(iss,iss.getPriority());
    }

    @Override
    public void dequeue() {
       theList.remove();
    }

    @Override
    public int size() {
        return theList.size();
    }

    @Override
    public boolean isEmpty() {
        return theList.isEmpty();
    }
    
    public String printList(){
        return theList.toString();
    }
    
}
