package Mastery;

import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Car Hyundai = new Car(9.5, 8.4, 5, 0.4, 120);
		Minivan Honda = new Minivan(10.6, 9.7, 2, 4, 5);
		Truck Ford = new Truck(11.1, 10.2, 2, 2, 8000);
		String choice = null;
		
		do {
		
		 
		
		System.out.println("Hello, and welcome to the Barker car dealership. Currently we have cars from Hyundai, minivans from Honda, and trucks from Ford available for purchase.");
		System.out.println("To procced, please select a model to look into more.");
		System.out.println("C: Hyundai car.");
		System.out.println("M: Honda minivan.");
		System.out.println("T: Ford truck.");
		System.out.println("Q: Shutdown application");
		System.out.println("Please make a selection:");
		
		choice = input.next();
		String action = null;
		
		if(choice.equalsIgnoreCase("C")) {
			System.out.println("What would you like to know about the Hyundai cars we have for sale?");
			System.out.println("C: Fuel economy in the city.");
			System.out.println("H: Fuel economy on the highway.");
			System.out.println("S: Seating capacity.");
			System.out.println("D: Cargo volume.");
			System.out.println("L: Top speed.");
			System.out.println("Q: Return to main menu.");
			System.out.println("Please make a selection:");
			
			action = input.next();
			if(action.equalsIgnoreCase("C")) {
				System.out.println("The car has a fuel economy in the city of: " + Hyundai.getfuelecoCity() + " L/Km.");
			}
			if(action.equalsIgnoreCase("H")) {
				System.out.println("The car has a fuel economy on the highway of: " + Hyundai.getfuelecoHgwy() + " L/Km.");
			}
			if(action.equalsIgnoreCase("S")) {
				System.out.println("The car has " + Hyundai.getseatcapacity() + " seats.");
			}
			if(action.equalsIgnoreCase("D")) {
				System.out.println("The car has cargo capacity of: " + Hyundai.getcargoVolume() + " cubic meters.");
			}
			if(action.equalsIgnoreCase("L")) {
				System.out.println("The car has a top speed of of: " + Hyundai.gettopspeed() + "Km/h.");
			}
		}
		
		if(choice.equalsIgnoreCase("M")) {
			System.out.println("What would you like to know about the Honda minivans we have for sale?");
			System.out.println("C: Fuel economy in the city.");
			System.out.println("H: Fuel economy on the highway.");
			System.out.println("S: Seating capacity.");
			System.out.println("D: Cargo volume.");
			System.out.println("L: Number of doors.");
			System.out.println("Q: Return to main menu.");
			System.out.println("Please make a selection:");
			
			action = input.next();
			if(action.equalsIgnoreCase("C")) {
				System.out.println("The minivan has a fuel economy in the city of: " + Honda.getfuelecoCity() + " L/Km.");
			}
			if(action.equalsIgnoreCase("H")) {
				System.out.println("The minivan has a fuel economy on the highway of: " + Honda.getfuelecoHgwy() + " L/Km.");
			}
			if(action.equalsIgnoreCase("S")) {
				System.out.println("The minivan has " + Honda.getseatcapacity() + " seats.");
			}
			if(action.equalsIgnoreCase("D")) {
				System.out.println("The minivan has cargo capacity of: " + Honda.getcargoVolume() + " cubic meters.");
			}
			if(action.equalsIgnoreCase("L")) {
				System.out.println("The minivan has " + Honda.getdoors() + " doors.");
			}
		}
		
		if(choice.equalsIgnoreCase("T")) {
			System.out.println("What would you like to know about the Ford trucks we have for sale?");
			System.out.println("C: Fuel economy in the city.");
			System.out.println("H: Fuel economy on the highway.");
			System.out.println("S: Seating capacity.");
			System.out.println("D: Cargo volume.");
			System.out.println("L: Towing capacity.");
			System.out.println("Q: Return to main menu.");
			System.out.println("Please make a selection:");
			
			action = input.next();
			if(action.equalsIgnoreCase("C")) {
				System.out.println("The truck has a fuel economy in the city of: " + Ford.getfuelecoCity() + " L/Km.");
			}
			if(action.equalsIgnoreCase("H")) {
				System.out.println("The truck has a fuel economy on the highway of: " + Ford.getfuelecoHgwy() + " L/Km.");
			}
			if(action.equalsIgnoreCase("S")) {
				System.out.println("The truck has " + Ford.getseatcapacity() + " seats.");
			}
			if(action.equalsIgnoreCase("D")) {
				System.out.println("The truck has cargo capacity of: " + Ford.getcargoVolume() + " cubic meters.");
			}
			if(action.equalsIgnoreCase("L")) {
				System.out.println("The truck has a top speed of of: " + Ford.gethaulingcapacity() + " Kg");
			}
		}
		}while(!choice.equalsIgnoreCase("Q"));
		System.out.println("Thank you for shopping with us.");
	}

}
