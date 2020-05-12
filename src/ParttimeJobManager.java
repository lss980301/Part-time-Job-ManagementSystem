import java.util.ArrayList;
import java.util.Scanner;

import Parttimejob.Cashier;
import Parttimejob.Clean;
import Parttimejob.Laborer;
import Parttimejob.ParttimeJob;
import Parttimejob.ParttimeJobinput;
import Parttimejob.ParttimejobKind;

public class ParttimeJobManager {
	ArrayList<ParttimeJobinput> parttimejobs = new ArrayList<ParttimeJobinput>();
	Scanner input;
	ParttimeJobManager(Scanner input){
		this.input = input;
	}

	public void addParttimejob() {
		int Kind = 0;
		ParttimeJobinput parttimejobinput;
		while (Kind != 1 && Kind != 2) {
			System.out.println("1 for Cashier");
			System.out.println("2 for Clean");
			System.out.println("3 for Laborer");
			System.out.println("Select num for Part-time job Kind ");
			Kind =  input.nextInt();
			if (Kind == 1) {
				parttimejobinput = new Cashier(ParttimejobKind.Cashier);
				parttimejobinput.getUserInput(input);
				parttimejobs.add(parttimejobinput);
				break;
			}
			else if (Kind == 2) {
				parttimejobinput = new Clean(ParttimejobKind.Clean);
				parttimejobinput.getUserInput(input);
				parttimejobs.add(parttimejobinput);
				break;
			}
			else if (Kind == 3) {
				parttimejobinput = new Laborer(ParttimejobKind.Laborer);
				parttimejobinput.getUserInput(input);
				parttimejobs.add(parttimejobinput);
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
		int index = findIndex(parttimejobID);
		
		removeParttimejob(index, parttimejobID);
	}
	
	public int findIndex(String parttimejobID) {
		int index = -1;
		for(int i = 0; i<parttimejobs.size(); i++) {
			if (parttimejobs.get(i).getID().equalsIgnoreCase(parttimejobID)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeParttimejob(int index, String parttimejobID) {
		if (index>=0) {
			parttimejobs.remove(index);
			System.out.println("The parttimejob" + parttimejobID + "is deleted");
			return 1;	
		}
		else {
			System.out.println("The parttimejob has not been registered");
			return -1;	
		}
	}

	public void editParttimejob() {
		System.out.print("Part-time job ID : ");
		String parttimejobID = input.next();
		for(int i = 0; i<parttimejobs.size(); i++) {
			ParttimeJobinput parttimejob = parttimejobs.get(i);
			if (parttimejob.getID().equalsIgnoreCase(parttimejobID)) {
				int num= -1;
				while(num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						parttimejob.setParttimeID(input);
						break;
					case 2:
						parttimejob.setParttimeName(input);
						break;
					case 3:
						parttimejob.setParttimeTime(input);
						break;
					case 4:
						parttimejob.setParttimeHours(input);
						break;
					case 5:
						parttimejob.setParttimeWage(input);
						break;
					default:
						continue;
					} // if
				} // while
				break;
			} // if
		} // for

	}

	public void viewParttimejobs() {
		System.out.println("# of registered ParttimeJobs: " + parttimejobs.size());
		for(int i = 0; i<parttimejobs.size(); i++) {
			parttimejobs.get(i).printInfo();
		}
	}

	
	public void showEditMenu() {
		System.out.println("** Part-time job Info Edit Menu **");
		System.out.println(" - Select one number between 1-6 - ");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Time");
		System.out.println(" 4. Edit Hours");
		System.out.println(" 5. Edit Wage");
		System.out.println(" 6. Exit");
	}
}
