package Parttimejob;

import java.util.Scanner;

public class Clean extends ParttimeJob {

	public Clean(ParttimejobKind Kind) {
		super(Kind);
	}
	


	public void getUserInput(Scanner input) {
		setParttimeID(input);
		setParttimeName(input);
		setParttimeTime(input);
		setParttimeHours(input);
		setParttimejobWagewithYN(input);
	}
	
	public void setParttimejobWagewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is the minimum hourly wage applied? ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				this.setWage(8590);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				setParttimeWage(input);
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("parttimejobKind: "+ skind + " parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobWage: " + Wage);
	}
	
	
}
