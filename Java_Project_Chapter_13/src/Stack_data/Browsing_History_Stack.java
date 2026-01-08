package Stack_data;

import java.util.Scanner;

public class Browsing_History_Stack 
{

	public static void main(String[] args) 
	{
		Stack2 history = new Stack2(10);
		
		Scanner input = new Scanner(System.in);
		
		String selection = null;
		int count = 0;
		
		System.out.println("Welcome to your broswer, enter your search below, type in q to quit, type r to go back to the previous search, and type h to see the size of your search history.");
		
		while(true)
		{
			selection = input.next();
			if(selection.equalsIgnoreCase("q"))
			{
				break;
			}
			else if(selection.equalsIgnoreCase("r"))
			{
				count -= 1;
				if (count <= 0)
				{
					System.out.println("Error: You have no items in your search history to go back to.");
					count += 1;
				}
				else
				{
				history.pop();
				System.out.println("You have searched for: " + history.top() + ", would you like to search for something else?");
				}
			}
			else if(selection.equalsIgnoreCase("c"))
			{
				System.out.println("Clearing browser history.");
				history.makeEmpty();
				count = 0;
			}
			else if(selection.equalsIgnoreCase("h"))
			{
				System.out.println("Items in search history: " + history.size());
			}
			else
			{
			if(count == 8)
			{
				System.out.println("Warning! You have reached the max number of searches that can be saved in your history, any more will not be saved. You can enter c to clear all your search history.");
			}
			else
			{
			count += 1;
			}
			history.push(selection);
			System.out.println("You have searched for: " + selection + ", would you like to search for something else?");
			}
		}
		System.out.println("Shutting down browser, goodbye!");
		
		
		
		
	}

}
