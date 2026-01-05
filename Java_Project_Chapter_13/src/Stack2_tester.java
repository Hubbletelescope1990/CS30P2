
public class Stack2_tester {

	public static void main(String[] args) 
	{
		Stack2 s2 = new Stack2(3);
		
		s2.push("Red");
		s2.push("Green");
		s2.push(5);
		System.out.println("Top of stack s2: " + s2.top());
		System.out.println("Items in stack s2: " + s2.size());
		s2.pop();
		System.out.println("Top of stack s2: " + s2.top());
		System.out.println("Items in stack s2: " + s2.size());
		
	}

}
