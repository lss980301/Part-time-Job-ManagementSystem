package Parttimejob;

import java.util.Scanner;

public class Laborer extends ParttimeJob {
	
	public Laborer(ParttimejobKind Kind) {
		super(Kind);
	}

	protected int DayWage;

	public void getUserInput(Scanner input) {
		setParttimeID(input);
		setParttimeName(input);
		setParttimeTime(input);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is there a set time?? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setParttimeHours(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setHours(00);
				break;
			}
			else {
			}
		}

		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Does the daily wage apply? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("What's the daily wage : ");
				int Wage = input.nextInt();
				this.setWage(Wage);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setWage(8590);
				break;
			}
			else {
			}
		}

	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("parttimejobKind: "+ skind + " parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobDailyWage: " + Wage);
	}
}
