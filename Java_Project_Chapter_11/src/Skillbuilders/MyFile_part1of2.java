package Skillbuilders;

import java.io.File;
import java.util.Scanner;

public class MyFile_part1of2 {

	public static void main(String[] args) {
		File textFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		
		//Obtain file name from user
		System.out.println("Enter file name: ");
		fileName = input.nextLine();
		
		//Determine if the file exists
		
		textFile = new File(fileName);
		if(textFile.exists()) 
		{
			System.out.println("File exists");
		} else 
		{
			System.out.println("File does NOT exist");
		}
	}

}
