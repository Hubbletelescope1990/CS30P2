
public class Stack2 
{
	private Object[] data;
	
	private int top;
	
	public Stack2(int maxItems) 
	{
		data = new Object[maxItems];//data gas as many cells as the max number of items
		top = -1;//Because 0 is the first element we use negative 1 as pointing to nothing
		
	}
	
	public Object top()//Returns the first value
	{
		return(data[top]);
	}
	public Object pop()//going down
	{
		top = top - 1;
		return(data[top + 1]);
	}
	
	public void push(Object item)//going up
	{
		if(top < data.length - 1)
		{
			top = top + 1;
			data[top] = item;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	
	public void makeEmpty()
	{
		top = -1;
	}
	
	public int size()
	{
		if(isEmpty())
		{
			return(0);
		} else
		{
			return(top + 1);
		}
	}
	
	
	
}
