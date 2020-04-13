import java.util.ArrayList;
import java.util.Scanner;

public class ParttimeJobManager {
	ArrayList<ParttimeJob> parttimejobs = new ArrayList<ParttimeJob>();
	Scanner input;
	ParttimeJobManager(Scanner input){
		this.input = input;
	}

	public void addParttimejob() {
		ParttimeJob parttimejob = new ParttimeJob();
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
		parttimejobs.add(parttimejob);
	}

	public void deleteParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		int index = -1;
		for(int i = 0; i<parttimejobs.size(); i++) {
			if (parttimejobs.get(i).ID.equalsIgnoreCase(parttimejobID)) {
				index = i;
				break;
			}
		}

		if (index>=0) {
			parttimejobs.remove(index);
		ParttimeJob.numParttimeJobsRegisterd--;
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
			if (parttimejob.ID.equalsIgnoreCase(parttimejobID)) {
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
					} // if
				} // while
				break;
			} // if
		} // for

	}

	public void viewParttimejobs() {
		//		System.out.print("Part-time job ID : ");
		//		String parttimejobID = input.next();
		System.out.println("# of registered ParttimeJobs: "+ParttimeJob.numParttimeJobsRegisterd);
		for(int i = 0; i<parttimejobs.size(); i++) {
			parttimejobs.get(i).printInfo();
		}

	}

}
