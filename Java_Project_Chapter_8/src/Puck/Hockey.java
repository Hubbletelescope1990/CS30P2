package Puck;

import java.util.Scanner;

public class Hockey {

	public static void main(String[] args) 
	{
		Puck_Part1 Puck1 = new Puck_Part1(1.5, 1, 5.3, true, false);//Standard puck with accurate size and weight
		Puck_Part1 Puck2 = new Puck_Part1(1.5, 1, 4.1, false, true);//Youth puck with accurate size and weight
		Puck_Part1 Puck3 = new Puck_Part1(1.5, 1, 5.3, false, false);//Puck meant to test errors with classification
		Puck_Part1 Puck4 = new Puck_Part1(1.5, 1, 5.3, true, true);//Puck meant to test errors with classification
		Puck_Part1 Puck5 = new Puck_Part1(1.2, 1, 5.3, true, false);//Puck has wrong radius
		Puck_Part1 Puck6 = new Puck_Part1(1.5, 1.2, 5.3, true, false);//Puck has wrong thickness
		Puck_Part1 Puck7 = new Puck_Part1(1.5, 1, 4.5, true, false);//Puck is too light for standard
		Puck_Part1 Puck8 = new Puck_Part1(1.5, 1, 5.5, false, true);//Puck is too heavy for youth
		
		Scanner input = new Scanner(System.in);
		
		int choice = 10;
		String action = null;
		
		do {
			
		choice = 10;
		Puck_Part1 puck = Puck1;
		
		System.out.println("Weclome to the hockey puck database. The information of 8 pucks is within our database, please make your selection below:");
		System.out.println("0: What data does this database store?");
		System.out.println("1-8: Select a puck to perform further action with.");
		System.out.println("9: Terminate the application");
		choice = input.nextInt();
		if (choice == 1) {
			puck = Puck1;
		}
		if (choice == 2) {
			puck = Puck2;
		}
		if (choice == 3) {
			puck = Puck3;
		}
		if (choice == 4) {
			puck = Puck4;
		}
		if (choice == 5) {
			puck = Puck5;
		}
		if (choice == 6) {
			puck = Puck6;
		}
		if (choice == 7) {
			puck = Puck7;
		}
		if (choice == 8) {
			puck = Puck8;
		}
		
		if (choice == 0) 
		{
			System.out.println("This database stores a pucks radius, thickness, wieght, and wether it is a standard puck or a youth puck.");
		} else if (choice <= 8){
			System.out.println("What would you like to do with puck " + choice + "?");
			System.out.println("W: Retrieves the pucks weight.");
			System.out.println("D: Retrieves the pucks division.");
			System.out.println("C: Compares the puck to another within this database.");
			System.out.println("A: Retrieves all the pucks information at once.");
			System.out.println("Q: Returns to the main menu.");
			action = input.next();
			
			if (action.equalsIgnoreCase("W")) {
				System.out.println(puck.getWeight());
			}
			if (action.equalsIgnoreCase("D")) {
				System.out.println(puck.getDivision());
			}
			//Placeholder for comparison action
			if (action.equalsIgnoreCase("A")) {
				System.out.println(puck.toString());
			}
			
		}
		
		}while(choice != 9);
		System.out.println("Thank you for using the hockey puck database, have a good day.");
	}

}
