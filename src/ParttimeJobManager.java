import java.util.Scanner;

public class ParttimeJobManager {
	ParttimeJob parttimejob;
	Scanner input;
	ParttimeJobManager(Scanner input){
		this.input = input;
	}

	public void addParttimejob() {
		parttimejob = new ParttimeJob();
		System.out.print("Part-time job ID : ");
		parttimejob.ID =  input.next();
		System.out.print("Part-time job Name : ");
		parttimejob.Name = input.next();
		System.out.print("Form What Time : ");
		parttimejob.Time = input.nextInt();
		System.out.print("How many hours : ");
		parttimejob.Hours = input.nextInt();
		System.out.print("What's the hourly wage : ");
		parttimejob.Wage = input.nextInt();
	}

	public void deleteParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		if (parttimejob == null) {
			System.out.println("The parttimejob has not been registered");
			return;
		}
		if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {
			parttimejob = null;
			System.out.println("The parttimejob is deleted");
		}
	}

	public void editParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {
			System.out.println("The parttimejob to be edited is" + parttimejobID);
		}

	}

	public void viewParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {
			parttimejob.printInfo();
		}
	}

}
