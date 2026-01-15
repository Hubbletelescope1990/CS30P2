package Queue_data;

public class QueueTester {

	public static void main(String[] args) {
		Queue q1 = new Queue(3);
		
		System.out.println("Adding red, yellow and orange");
		
		q1.enqueue("red");
		q1.enqueue("yellow");
		q1.enqueue("orange");
		
		System.out.println("Front of queue: " + q1.front());
		System.out.println("Size of queue: " + q1.size());
		
		Object s = q1.dequeue();
		System.out.println(s);
		
		System.out.println("Front of queue: " + q1.front());
		System.out.println("Size of queue: " + q1.size());
	}

}
