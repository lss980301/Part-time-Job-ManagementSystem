package Parttimejob;

import java.util.Scanner;

public class Clean extends ParttimeJob {

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

		System.out.print("How many hours : ");
		int Hours = input.nextInt();
		this.setHours(Hours);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is the minimum hourly wage applied? ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				this.setWage(8590);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print("What's the hourly wage : ");
				int Wage = input.nextInt();
				this.setWage(Wage);
				break;
			}
			else {
			}
		}

	}
}
