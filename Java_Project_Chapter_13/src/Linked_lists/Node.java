package Linked_lists;

public class Node 
{
	private String data;
	private Node next;
	
	//Constructor method
	public Node(String newData)
	{
		data = newData;
		next = null;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node newNode)
	{
		next = newNode;
	}
	
	public String getData()
	{
		return(data);
	}
	
	
	
	
}
