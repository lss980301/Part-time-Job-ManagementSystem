import java.util.Scanner;

public class MenuManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num= 5;

		while(num != 6) {
			System.out.println("*** Part-time job Management System Menu ***");
			System.out.println(" -- Select one number between 1-6 -- ");
			System.out.println(" 1. Add Part-time job");
			System.out.println(" 2. Delete Part-time job");
			System.out.println(" 3. Edit Part-time job");
			System.out.println(" 4. View Part-time job");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			num = input.nextInt();
			if(num == 1) {
				addParttimejob();
			}
			else if(num == 2) {
				deleteParttimejob();
			}
			else if(num == 3) {
				editParttimejob();
			}
			else if(num == 4) {
				viewParttimejob();
			}
			else {
				continue;
			}
		}

	}

	public static void addParttimejob() {
		Scanner input = new Scanner(System.in);
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		System.out.print("Part-time job Name : ");
		String parttimejobName = input.next();
		System.out.print("Form What Time : ");
		int parttimejobTime = input.nextInt();
		System.out.print("How many hours : ");
		int parttimejobHow = input.nextInt();
		System.out.print("What's the hourly wage : ");
		int parttimejobWage = input.nextInt();
	}

	public static void deleteParttimejob() {
		Scanner input = new Scanner(System.in);
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
	}

	public static void editParttimejob() {
		Scanner input = new Scanner(System.in);
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
	}

	public static void viewParttimejob() {
		Scanner input = new Scanner(System.in);
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
	}

}