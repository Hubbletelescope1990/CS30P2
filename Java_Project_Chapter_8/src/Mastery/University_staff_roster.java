package Mastery;

import java.util.Scanner;

public class University_staff_roster {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Staff employee1 = new Staff("Jeremy", "Science", 120000, "Professor");
		Staff employee2 = new Staff("Elizabeth", "Buisness", 165000, "Department head");
		Staff employee3 = new Staff("Alex", "Maintenence", 80000, "Janitor");
		
		int choice = 20;
		String action = null;
		
		do {
		
		System.out.println("You have accessed the new University employee roster, currently, the data of 3 employees are available for access.");
		System.out.println("What would you like to do?");
		System.out.println("1-3: select an employee to perform further action with");
		System.out.println("0: shutdown application");
		
		choice = input.nextInt();
		Staff employee = null;
		
		if (choice == 1) {
			employee = employee1;
		}
		if (choice == 2) {
			employee = employee2;
		}
		if (choice == 3) {
			employee = employee3;
		}		
		
		if(choice <= 3 && choice > 0) {
			System.out.println("What would you like to do with employee " + choice + "?");
			System.out.println("N: Retrieves the employees name.");
			System.out.println("S: Retrieves the employees salary.");
			System.out.println("D: Retrieves the employees department");
			System.out.println("J: Retrieves the employees job title.");
			System.out.println("Q: Returns to the main menu.");
			action = input.next();
			
			if (action.equalsIgnoreCase("N")) {
				System.out.println("The name of employee " + choice + " is: " + employee.getName());			}
			if (action.equalsIgnoreCase("S")) {
				System.out.println("The salary of employee " + choice + " is: " + employee.getSalary());			
			}
			if (action.equalsIgnoreCase("D")) {
				System.out.println("The department of employee " + choice + " is: " + employee.getDepartment());			
			}
			if (action.equalsIgnoreCase("J")) {
				System.out.println("The job title of employee " + choice + " is: " + employee.getJob());			
			}
		}
		
		} while (choice != 0);
		System.out.println("Shutting down application. Have a good day.");
	}

}
