package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public class Node {
    private Issue data;
    public Node pointer;
    
    public Node(Issue iss){
        data = iss;
    }
    
    public Issue getData(){
        return data;
    }
    
    public Node getNext(){
        return pointer;
    }
    
    public void setNext(Node p){
        pointer = p;
    }
    
    public int getPriorityKey(){
        return data.getPriority();
    }
    
}
