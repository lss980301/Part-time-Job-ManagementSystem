package Parttimejob;

import java.util.Scanner;

public class Cashier extends ParttimeJob {

	public Cashier(ParttimejobKind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		setParttimeID(input);
		setParttimeName(input);
		setParttimeTime(input);
		setParttimeHours(input);
		setParttimeWage(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("parttimejobKind: "+ skind + " parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobWage: " + Wage);
	}

}
