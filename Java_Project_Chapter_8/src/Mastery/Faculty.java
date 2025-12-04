package Mastery;

public class Faculty extends UEmployee {
	private String department;
	
	public Faculty (String d, double s, String n) {
		super(n, s);
		department = d;
	}
	
	public String getDepartment() {
		return(department);
	}
	
}
