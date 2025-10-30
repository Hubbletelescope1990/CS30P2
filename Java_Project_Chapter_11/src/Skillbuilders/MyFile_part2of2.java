package Skillbuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile_part2of2 {

	public static void main(String[] args) {
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		textFile = new File("C:\\Users\\38247004\\git\\CS30P2\\Java_Project_Chapter_11\\src\\Skillbuilders\\zzz.txt");
		
		if(textFile.exists()) {
			System.out.println("Error: File already exists");
		} else {
			try {
				textFile.createNewFile();
				System.out.println("File has been created.");
			} catch(IOException e) {
				System.out.println("Error: File cannot be made");
				System.err.println("IOException error");
			}
		}
		 System.out.println("Would you like to keep the file(k) or delete the file(d)?");
		 response = input.next();
		 
		 if(response.equalsIgnoreCase("d"))
		 {
			 if(textFile.delete()) 
			 {
				 System.out.println("File has been succesfully deleted");
			 } 

		
		 } else
		 {
			 System.out.print("File has been kept");
		 }
			
		
		
	}

}
