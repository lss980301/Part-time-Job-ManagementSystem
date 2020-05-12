package Parttimejob;

import java.util.Scanner;

public interface ParttimeJobinput {
	
	public String getID();
	
	public void setID(String iD);
	
	public void setName(String name);
	
	public void setTime(int time);
	
	public void setHours(int hours);
	
	public void setWage(int wage);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setParttimeID(Scanner input);
	
	public void setParttimeName(Scanner input);
	
	public void setParttimeTime(Scanner input);
	
	public void setParttimeHours(Scanner input);
	
	public void setParttimeWage(Scanner input);
	
}
