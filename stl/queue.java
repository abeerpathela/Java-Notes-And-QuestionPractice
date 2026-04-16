import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>(); // initialization of queue 
		
		q.offer(12); // this adds a element to the queue 
		q.offer(24);
		q.offer(36);
		
		System.out.println(q); // this prints the whole queue
		
		q.poll(); // this removes a element from the front 
		
		System.out.println(q);
		
		System.out.println(q.peek()); // tells the element which is on the front of the queue 
	}
}
