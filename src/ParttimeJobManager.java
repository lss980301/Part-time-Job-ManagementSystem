import java.util.ArrayList;
import java.util.Scanner;

import Parttimejob.Clean;
import Parttimejob.ParttimeJob;

public class ParttimeJobManager {
	ArrayList<ParttimeJob> parttimejobs = new ArrayList<ParttimeJob>();
	Scanner input;
	ParttimeJobManager(Scanner input){
		this.input = input;
	}

	public void addParttimejob() {
		int Kind = 0;
		ParttimeJob parttimejob;
		while (Kind != 1 && Kind != 2) {
			System.out.print("1 for Clean");
			System.out.println(" 2 for Cashier");
			System.out.print("Select num for Part-time job Kind ");
			Kind =  input.nextInt();
			if (Kind == 1) {
				parttimejob = new ParttimeJob();
				parttimejob.getUserInput(input);
				parttimejobs.add(parttimejob);
				break;
			}
			else if (Kind == 2) {
				parttimejob = new Clean();
				parttimejob.getUserInput(input);
				parttimejobs.add(parttimejob);
				break;
			}
			else {
				System.out.print("Select num for Part-time job Kind Between 1 and 2 ");
			}
		}

	}

	public void deleteParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		int index = -1;
		for(int i = 0; i<parttimejobs.size(); i++) {
			if (parttimejobs.get(i).getID().equalsIgnoreCase(parttimejobID)) {
				index = i;
				break;
			}
		}

		if (index>=0) {
			parttimejobs.remove(index);
			System.out.println("The parttimejob" + parttimejobID + "is deleted");
		}
		else {
			System.out.println("The parttimejob has not been registered");
			return;	
		}
	}


	public void editParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		for(int i = 0; i<parttimejobs.size(); i++) {
			ParttimeJob parttimejob = parttimejobs.get(i);
			if (parttimejob.getID().equalsIgnoreCase(parttimejobID)) {
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
						String ID =  input.next();
						parttimejob.setID(ID);
					}
					else if(num == 2) {
						System.out.print("Part-time job Name : ");
						String Name = input.next();
						parttimejob.setName(Name);
					}
					else if(num == 3) {
						System.out.print("Form What Time : ");
						int Time = input.nextInt();
						parttimejob.setTime(Time);;
					}
					else if(num == 4) {
						System.out.print("How many hours : ");
						int Hours = input.nextInt();
						parttimejob.setHours(Hours);
					}
					else if(num == 5) {
						System.out.print("What's the hourly wage : ");
						int Wage = input.nextInt();
						parttimejob.setWage(Wage);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for

	}

	public void viewParttimejobs() {
		//		System.out.print("Part-time job ID : ");
		//		String parttimejobID = input.next();
		System.out.println("# of registered ParttimeJobs: " + parttimejobs.size());
		for(int i = 0; i<parttimejobs.size(); i++) {
			parttimejobs.get(i).printInfo();
		}

	}

}
