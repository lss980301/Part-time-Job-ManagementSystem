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
		if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {       // 문자열 비교를 위해 equalsIgnoreCase() 를 사용하였습니다!   
			parttimejob = null;
			System.out.println("The parttimejob is deleted");
		}
	}

	public void editParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {      // 문자열 비교를 위해 equalsIgnoreCase() 를 사용하였습니다!
			int num= -1;
			while(num != 6) {
				System.out.println("** Part-time job Info Edit Menu **");
				System.out.println(" - Select one number between 1-6 - ");
				System.out.println(" 1. Edit Id");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Time");
				System.out.println(" 4. Edit Hours");
				System.out.println(" 5. Edit Wage");
				System.out.println(" 6. Exit");
				num = input.nextInt();
				if(num == 1) {
					System.out.print("Part-time job ID : ");
					parttimejob.ID =  input.next();
				}
				else if(num == 2) {
					System.out.print("Part-time job Name : ");
					parttimejob.Name = input.next();
				}
				else if(num == 3) {
					System.out.print("Form What Time : ");
					parttimejob.Time = input.nextInt();
				}
				else if(num == 4) {
					System.out.print("How many hours : ");
					parttimejob.Hours = input.nextInt();
				}
				else if(num == 5) {
					System.out.print("What's the hourly wage : ");
					parttimejob.Wage = input.nextInt();
				}
				else {
					continue;
				}
			}

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
