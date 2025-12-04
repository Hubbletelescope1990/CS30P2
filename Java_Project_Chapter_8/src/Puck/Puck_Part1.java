package Puck;

public class Puck_Part1 extends Disk 
{
	//Puck part 2 is also included in this class
	private double weight;
	private boolean standard;
	private boolean youth;
//Creates a puck with set radius, thickness, weight, and if it's standard or youth
	public Puck_Part1(double r, double t, double w, boolean s, boolean y) {
		super(r, t);
		weight = w;
		standard = s;
		youth = y;
	}
	
	
	//Returns weight of the Puck
	public String getWeight() 
	{
		return("The puck weighs: " + weight + " ounces.");
	}
	
	//Returns the division of the Puck
	public String getDivision() 
	{
		if(standard == false && youth == true) {
			return("Puck is for the youth division");
		} else if (standard == true && youth == false) {
			return("Puck is for the standard division");
		} else {//Since the puck can only be youth OR standard, if it is classed as both or neither, you get an error
			return("Error");
		}
	}
	
	public boolean equals(Object d) 
	{
		Puck_Part1 testObj = (Puck_Part1)d;
		
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == super.getThickness() && testObj.weight == weight && testObj.standard == standard && testObj.youth == youth) 
		{
			return(true);
		} else {
			return(false);
		}
		
	}
	
	public String toString() {//Returns all of the information of the puck in one go
		if (standard == true && youth != true) {
			return(super.toString() + " The hockey puck weighs: " + weight + "g, it is a standard puck.");
		}
		if (standard == false && youth != false) {
			return(super.toString() + " The hockey puck weighs: " + weight + "g, it is a youth puck.");
		} else {
			return("Error: This puck has beem classed as both a standard and a youth puck, a report has been submitted and we will look into it shortly. We apologize for any inconvenience.");
		}
		
	}
	//Puck part 2 compareTo method
	public int compareTo(Object c) {
		Puck_Part1 testPuck = (Puck_Part1)c;
		
		if (weight < testPuck.weight) 
		{
			return(-1);
		} else if (weight == testPuck.weight) 
		{
			return(0);
		} else 
		{
			return(1);
		}
	}
	
	
	
	
	

}

