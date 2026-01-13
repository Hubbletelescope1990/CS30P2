package Linked_lists;

import java.util.Scanner;

public class Word_maker_Linked_lists {

	public static void main(String[] args) {
		
		Linked_List list = new Linked_List();
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		String choice = null;
		int k = 0;
		int q = 0;
		int a = 0;
		int u = 0;
		int r = 0;
		
		System.out.println("Hello! And welcome to todays game. The game is quite simple, you will be provided with 5 letters, what end of the list they will be added, and the word you are supposed to make.");
		while(true)
		{
		
		if(counter == 5)
		{
			System.out.print("Your word has been assembled:\n" + list.toString() + "\nDid you get it right? Press z to try again, or m to quit.\n");
		}	
		System.out.println("Your word is: Quark");
		System.out.println("K: added to the rear");
		System.out.println("Q: added to the front");
		System.out.println("A: added to the rear");
		System.out.println("U: added to the front");
		System.out.println("R: added to the rear");
		System.out.println("Please enter witch letter you would like to enter first, or press z to reset the list, or press m to shutdown the game.");
		choice = input.next();
		
		if(choice.equalsIgnoreCase("m"))
		{
			System.out.println("Shutting down game, goodbye!");
			break;
		}
		else if(choice.equalsIgnoreCase("z"))
		{
			System.out.println("Reseting word.");
			list.makeEmpty();
			counter = 0;
			q = 0;
			u = 0;
			a = 0;
			r = 0;
			k = 0;
		}
		else if(choice.equalsIgnoreCase("K"))
		{
			
			if(k >= 1)
			{
				System.out.println("You have already added K.");
			}
			else
			{
				list.addAtEnd("k");
				System.out.println("Added k.");
				k += 1;
				counter += 1;
			}
		}
		else if(choice.equalsIgnoreCase("q"))
		{
			
			if(q >= 1)
			{
				System.out.println("You have already added Q.");
			}
			else
			{
				list.addAtFront("q");
				System.out.println("Added Q.");
				q += 1;
				counter += 1;
			}
		}
		else if(choice.equalsIgnoreCase("A"))
		{
			
			if(a >= 1)
			{
				System.out.println("You have already added A.");
			}
			else
			{
				list.addAtEnd("a");
				System.out.println("Added A.");
				a += 1;
				counter += 1;
			}
		}
		else if(choice.equalsIgnoreCase("u"))
		{
			
			if(u >= 1)
			{
				System.out.println("You have already added U.");
			}
			else
			{
				list.addAtFront("u");
				System.out.println("Added U.");
				u += 1;
				counter += 1;
			}
		}
		else if(choice.equalsIgnoreCase("r"))
		{
			
			if(r >= 1)
			{
				System.out.println("You have already added R.");
			}
			else
			{
				list.addAtEnd("r");
				System.out.println("Added R.");
				r += 1;
				counter += 1;
			}
		}
		else 
		{
			System.out.println("You have entered an ivalid item, please try again.");
		}
		
		}
		

	}

}
