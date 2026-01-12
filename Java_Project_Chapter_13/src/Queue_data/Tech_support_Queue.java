package Queue_data;
import java.util.Scanner;
public class Tech_support_Queue 
{

	public static void main(String[] args) 
	{
		Queue support_lineup = new Queue(7);
		
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		int Jess = 0;
		int Rob = 0;
		int James = 0;
		int Beth = 0;
		int Ross = 0;
		int Eliz = 0;
		int Fred = 0;
		int Mich = 0;
		int counter = 0;
		int selection = 0;
		
		System.out.println("Welcome administrator! Before you begin your shift,"
				+ " you must create your queue of who you will be helping today, the system has detected: 8 people requesting assistance at the moment."
				+ " Your queue only has room for seven. You will be provided basic information on the help request so you can sort them appropiately.");
		System.out.println("(1)Jessica: I'm getting nothing but a blue screen, and some errors.");
		System.out.println("(2)Robert: My computer is on fire.");
		System.out.println("(3)James: Some of my important work files got corrupted, please help!");
		System.out.println("(4)Bethany: Honestly, I'd just like to socialize with someone right now.");
		System.out.println("(5)Ross: Where is the save button?");
		System.out.println("(6)Elizabeth: My computer is running really slowly on the network.");
		System.out.println("(7)Fredrick: same af the keis an ny keibaard are braken.");
		System.out.println("(8)Michael: How do I clean a mess off of my monitor?.");
		System.out.println("");
		System.out.println("Please sort the help requests into the list by order of high priority to low priority");
		
		while(counter != 7)
		{
		System.out.println("");
		choice = input.nextInt();
		
		if(choice <= 0 || choice > 8)
		{
			System.out.println("Error! You have entered an invalid number, please try again");
		}
		else if(choice == 1)
		{
			Jess += 1;
			if(Jess >= 2)
			{
				System.out.println("You have already queued: Jessica.");
			}
			else
			{
				System.out.println("You have queued: Jessica.");
				support_lineup.enqueue("Jessica");
				counter += 1;
			}
		}
		else if(choice == 2)
		{
			Rob += 1;
			if(Rob >= 2)
			{
				System.out.println("You have already queued: Robert.");
			}
			else
			{
				System.out.println("You have queued: Robert.");
				support_lineup.enqueue("Robert");
				counter += 1;
			}
		}
		else if(choice == 3)
		{
			James += 1;
			if(James >= 2)
			{
				System.out.println("You have already queued: James.");
			}
			else
			{
				System.out.println("You have queued: James.");
				support_lineup.enqueue("James");
				counter += 1;
			}
		}
		else if(choice == 4)
		{
			Beth += 1;
			if(Beth >= 2)
			{
				System.out.println("You have already queued: Bethany.");
			}
			else
			{
				System.out.println("You have queued: Bethany.");
				support_lineup.enqueue("Bethany");
				counter += 1;
			}
		}
		else if(choice == 5)
		{
			Ross += 1;
			if(Ross >= 2)
			{
				System.out.println("You have already queued: Ross.");
			}
			else
			{
				System.out.println("You have queued: Ross.");
				support_lineup.enqueue("Ross");
				counter += 1;
			}
		}
		else if(choice == 6)
		{
			Eliz += 1;
			if(Eliz >= 2)
			{
				System.out.println("You have already queued: Elizabeth");
			}
			else
			{
				System.out.println("You have queued: Elizabeth.");
				support_lineup.enqueue("Elizabeth");
				counter += 1;
			}
		}
		else if(choice == 7)
		{
			Fred += 1;
			if(Fred >= 2)
			{
				System.out.println("You have already queued: Fredrick.");
			}
			else
			{
				System.out.println("You have queued: Fredrick.");
				support_lineup.enqueue("Fredrick");
				counter += 1;
			}
		}
		else if(choice == 8)
		{
			Mich += 1;
			if(Mich >= 2)
			{
				System.out.println("You have already queued: Michael.");
			}
			else
			{
				System.out.println("You have queued: Michael.");
				support_lineup.enqueue("Michael");
				counter += 1;
			}
		}
		}
		
		while(support_lineup.size() != 0)
		{
		System.out.println("Your queue list is now has: " + support_lineup.size() + " people remaining.");
		System.out.println("Next client in line: " + support_lineup.front() + ".");
		System.out.println("What would you like to do?");
		System.out.println("(1)Move up the line.");
		System.out.println("(2)Clear the line.");
		selection = input.nextInt();
		
		if(selection == 1)
		{
			System.out.println("Dequeueing: " + support_lineup.front() + ".");
			support_lineup.dequeue();
		}
		else if(selection == 2)
		{
			System.out.println("Warning! You are about to clear the entire queue, are you sure?(y or n)");
			String confirm = input.next();
			if(confirm.equalsIgnoreCase("y"))
			{
				System.out.println("Clearing list.");
				support_lineup.makeEmpty();
			}
			else
			{
				System.out.println("Action canceled");
			}
		}
		else
		{
			System.out.println("You have entered an invalid input, please try again.");
		}
		
		}
		System.out.println("Queue empty! Shutting down application, goodbye!");
		
		
		
		
		
		
	}

}
