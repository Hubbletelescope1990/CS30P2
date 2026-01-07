package Linked_lists;

public class Linked_list_tester 
{

	public static void main(String[] args) 
	{
		Linked_List list = new Linked_List();
		
		list.addAtFront("Bannana");
		list.addAtFront("Cherry");
		list.addAtFront("Apple");
		
		System.out.println("List has: " + list.size() + " items.");
		System.out.println(list.toString());
		
		
		
	}

}
