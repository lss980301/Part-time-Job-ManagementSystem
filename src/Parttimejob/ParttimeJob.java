package Parttimejob;

import java.util.Scanner;

public abstract class ParttimeJob implements ParttimeJobinput{
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

	public abstract void printInfo();

	public void setParttimeID(Scanner input) {
		System.out.print("Part-time job ID : ");
		String ID =  input.next();
		this.setID(ID);
	}

	public void setParttimeName(Scanner input) {
		System.out.print("Part-time job Name : ");
		String Name = input.next();
		this.setName(Name);
	}

	public void setParttimeTime(Scanner input) {
		System.out.print("Form What Time : ");
		int Time = input.nextInt();
		this.setTime(Time);
	}

	public void setParttimeHours(Scanner input) {
		System.out.print("How many hours : ");
		int Hours = input.nextInt();
		this.setHours(Hours);

	}

	public void setParttimeWage(Scanner input) {
		System.out.print("What's the hourly wage : ");
		int Wage = input.nextInt();
		this.setWage(Wage);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.Kind) {
		case Clean:
			skind = "Clean";
			break;
		case Laborer:
			skind = "Laborer";
			break;
		case Cashier:
			skind = "Cashier";
			break;
		default:
		}
		return skind;
	}
}
