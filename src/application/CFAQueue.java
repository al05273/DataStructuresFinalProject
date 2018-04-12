package application;


public class CFAQueue {
	
	 public static void main(String[] args) 
	    {
	        Queue q= new Queue();
	        q.enqueue("Jesus");
	        q.enqueue("Mark");
	        q.enqueue("Bob");
	        q.enqueue("Pat");
	        q.enqueue("Hello");
	         
	        System.out.println("Dequeued item is "+ q.dequeue().key);
	        System.out.println("Dequeued item is "+ q.dequeue().key);
	        System.out.println("Dequeued item is "+ q.dequeue().key);
	        System.out.println("Dequeued item is "+ q.dequeue().key);
}
}
