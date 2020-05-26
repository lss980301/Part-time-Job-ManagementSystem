package Parttimejob;

import java.io.Serializable;
import java.util.Scanner;

import Exceptions.DateFormatException;

public abstract class ParttimeJob implements ParttimeJobinput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2331189212635848111L;
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
		this.Kind = kind;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) throws DateFormatException {
		if (!ID.contains("월") || !ID.contains("일")) {
			throw new DateFormatException();
		}
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		this.Time = time;
	}

	public int getHours() {
		return Hours;
	}

	public void setHours(int hours) {
		this.Hours = hours;
	}

	public int getWage() {
		return Wage;
	}

	public void setWage(int wage) {
		this.Wage = wage;
	}

	public abstract void printInfo();

	public void setParttimeID(Scanner input) {
		String ID = "";
		while (!ID.contains("월") || !ID.contains("일")) {
			System.out.print("Part-time job ID : ");
			ID =  input.next();
			try {
				this.setID(ID);
			} catch (DateFormatException e) {
				System.out.println("Incorrect ID(Date) Format. put the ID that contains 월,일");
			}	
		}

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
