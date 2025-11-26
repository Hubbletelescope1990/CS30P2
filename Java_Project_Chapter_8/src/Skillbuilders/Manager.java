package Skillbuilders;

public class Manager extends Employee
{
	private double yearlysalary;
	
	public Manager(String fn, String ln, double S) 
	{
		super(fn, ln);
		yearlysalary = S;
	}
	
	public double pay(double weeks) 
	{
		double payEarned;
		
		payEarned = yearlysalary/52*weeks;
		
		return payEarned;
	}
	
	public String toString() 
	{
		return(super.toString() + ", Manager Salary: " + yearlysalary);
	}
}
