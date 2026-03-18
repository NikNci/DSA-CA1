package roadmonitor;

/**
 *
 * @author Nikolas Misins
 */
public class Stack implements StackInterface{
    private Node head,curr;
    private int size;

    public Stack() {
        head = curr = null;
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
    public void push(Issue i) {
        Node newNode = new Node(i);
        if (isEmpty()){
            //if first node in list
            head=newNode;
        }else{
            head.setNext(newNode);
            head = newNode;
        }
        size++;
    }

    @Override
    public void pop() {
        if (isEmpty()){
            //does nothing
        }else if (size==1){
            //removing just the head
            head=null;
            size--;
        }else{
            //replacing head
            head=head.getNext();
            size--;
        }
    }

    @Override
    public Issue peek() {
        return head.getData();
    }
    
}
