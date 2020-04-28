package Parttimejob;

import java.util.Scanner;

public class Laborer extends ParttimeJob {

	public Laborer(ParttimejobKind Kind) {
		super(Kind);
	}

	protected int DayWage;

	public void getUserInput(Scanner input) {
		System.out.print("Part-time job ID : ");
		String ID =  input.next();
		this.setID(ID);

		System.out.print("Part-time job Name : ");
		String Name = input.next();
		this.setName(Name);

		System.out.print("Form What Time : ");
		int Time = input.nextInt();
		this.setTime(Time);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is there a set time?? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("What's the How many hours ? : ");
				int Hours = input.nextInt();
				this.setHours(Hours);
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
		String skind = "none";
		switch(this.Kind) {
		case Clean:
			skind = "Clean.";
			break;
		case Cashier:
			skind = "Cashier.";
			break;	
		case Laborer:
			skind = "Laborer.";
			break;			
		default:
		}
		System.out.println("parttimejobKind: "+ Kind + " parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobDailyWage: " + Wage);
	}
}
