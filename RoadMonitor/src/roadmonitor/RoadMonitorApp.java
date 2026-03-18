package roadmonitor;

/**
 * 
 * @author Nikolas Misins
 */
public class RoadMonitorApp {
    public static void main(String[] args) {
//        RoadMonitorGUI GUI = new RoadMonitorGUI();
//        GUI.setVisible(true);
    
        PriorityQueue pq = new PriorityQueue();
        
        Issue i = new Issue("hurricane",2);
        Issue j = new Issue("flood",1);
        Issue b = new Issue("storm",3);
        Issue m = new Issue("something else",10);
        Issue n = new Issue("s]anotherse",6);
        
        pq.enqueue(i);
        pq.enqueue(j);
        pq.enqueue(b);
        pq.enqueue(m);
        pq.enqueue(n);
        
        System.out.println(pq.printList());
    }
}
