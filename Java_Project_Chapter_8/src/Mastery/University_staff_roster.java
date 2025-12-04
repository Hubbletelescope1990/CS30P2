package Mastery;

import java.util.Scanner;

public class University_staff_roster {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Staff employee1 = new Staff("Jeremy", "Science", 120000, "Professor");
		Staff employee2 = new Staff("Elizabeth", "Buisness", 165000, "Department head");
		Staff employee3 = new Staff("Alex", "Maintenence", 80000, "Janitor");
		
		int choice;
		String action = null;
		
		do {
		
		System.out.println("You have accessed the new University employee roster, currently, the data of 3 employees are available for access.");
		System.out.println("What would you like to do?");
		System.out.println("1-3: select an employee to perform further action with");
		System.out.println("0: shutdown application");
		
		choice = input.nextInt();
		
		if(choice <= 3) {
			System.out.println("What would you like to do with employee " + choice + "?");
			System.out.println("N: Retrieves the employees name.");
			System.out.println("S: Retrieves the employees salary.");
			System.out.println("D: Retrieves the employees department");
			System.out.println("J: Retrieves the employees job title.");
			System.out.println("Q: Returns to the main menu.");
			action = input.next();
			
			if (action == "N") {
				
			}
		}
		
		
		} while(choice != 0);
	}

}
