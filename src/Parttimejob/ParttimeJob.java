package Parttimejob;

import java.util.Scanner;

public class ParttimeJob {
	protected ParttimejobKind Kind = ParttimejobKind.Clean;
	protected String ID;
	protected String Name;
	protected int Time;
	protected int Hours;
	protected int Wage;

	public ParttimeJob() {
	}
	
	public ParttimeJob(ParttimejobKind Kind) {
		this.Kind = Kind;
	}

	public ParttimeJob(String ID,String Name) {
		this.ID = ID;
		this.Name = Name;
	}

	public ParttimeJob(ParttimejobKind Kind, String ID, String Name, int Time, int Hours, int Wage) {
		this.Kind = Kind;
		this.ID = ID;
		this.Name = Name;
		this.Time = Time;
		this.Hours = Hours;
		this.Wage = Wage;
	}

	public ParttimejobKind getKind() {
		return Kind;
	}

	public void setKind(ParttimejobKind kind) {
		Kind = kind;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	public int getHours() {
		return Hours;
	}

	public void setHours(int hours) {
		Hours = hours;
	}

	public int getWage() {
		return Wage;
	}

	public void setWage(int wage) {
		Wage = wage;
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
		System.out.println("parttimejobKind: "+ Kind + " parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobWage: " + Wage);
	}

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

		System.out.print("What's the hourly wage : ");
		int Wage = input.nextInt();
		this.setWage(Wage);
	}

}
