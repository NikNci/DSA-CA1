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
    
    /**
     *
     * get() only really works on getting curr that is NOT head, so there must be a separate method
     */
    public Issue getTop(){
        return head.getData();
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
        size--;
    }

    @Override
    public void add(Issue iss, int index) {
        Node newNode = new Node(iss);
        if (isEmpty()){
            head=newNode;
            head.setNext(null);
        }else if(index==1){
            newNode.setNext(head);
            head=newNode;
        }else{
            setCurrent(index);
            newNode.setNext(curr);
            prev.setNext(newNode);
        }
        size++;
    }
    
    //I sort of re-invented the wheel here with how this method works, but
    //it was necessary as the usual method I was taught in class did not account
    //for index values greater than the size of the list. 
    public void setCurrent(int index){
        curr = head.getNext();
        prev = head;
        while (curr!=null){
            if(prev.getData().getPriority()<index && index<curr.getData().getPriority()){
                break;
            }
            prev=curr;
            curr=curr.getNext();
            
        }
    }
    
    /**
     *
     * This method is for outputting a list of all traffic events
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        curr=head;
        for (int i = 0; i<size ; i++){
            sb.append((i+1) + ". ");
            sb.append(curr.getData().getDescription());
            sb.append(", priority ");
            sb.append(curr.getData().getPriority());
            sb.append("\n");
            curr=curr.getNext();
        }
        
        return sb.toString();
    }
    
}
