package Parttimejob;

import java.util.Scanner;

import Exceptions.DateFormatException;

public interface ParttimeJobinput {
	
	public String getID();
	
	public void setID(String iD) throws DateFormatException;
	
	public void setName(String name);
	
	public String getName();
	
	public void setTime(int time);
	
	public int getTime();
	
	public void setHours(int hours);
	
	public int getHours();
	
	public void setWage(int wage);
	
	public int getWage();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setParttimeID(Scanner input);
	
	public void setParttimeName(Scanner input);
	
	public void setParttimeTime(Scanner input);
	
	public void setParttimeHours(Scanner input);
	
	public void setParttimeWage(Scanner input);
	
}
