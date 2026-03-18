package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public class SinglyLinkedList implements SLLInterface{
    private int size;
    private Node head,curr,prev;

    public SinglyLinkedList() {
        head=curr=prev=null;
        size=0;
    }
    
    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Issue get(int index) {
        setCurrent(index);
        return curr.getData();
    }

    //as this is for priority queue, no need to bother with index when removing
    @Override
    public void remove() {
        if(isEmpty()){
            //do nothing
        }
        else if ((size==1)){
            head=null;
        }else{
            head=head.getNext();
        }
    }

    @Override
    public void add(Issue iss, int index) {
        Node newNode = new Node(iss);
        if (isEmpty()){
            head=newNode;
        }else if (index==1){
            head.setNext(newNode);
            head=newNode;
        }else{
            setCurrent(index);
            prev.setNext(newNode);
            newNode.setNext(curr);
        }
    }
    
    public void setCurrent(int index){
        curr = head;
        prev = null;
        for (int i=1;i<index;i++){
            prev = curr;
            curr=curr.getNext();
        }

    }
    
}
