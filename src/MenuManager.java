import java.util.Scanner;

public class MenuManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ParttimeJobManager parttimeJobManager = new ParttimeJobManager(input);

		int num= -1;
		while(num != 5) {
			System.out.println("*** Part-time job Management System Menu ***");
			System.out.println(" -- Select one number between 1-5 -- ");
			System.out.println(" 1. Add Part-time job");
			System.out.println(" 2. Delete Part-time job");
			System.out.println(" 3. Edit Part-time job");
			System.out.println(" 4. View Part-time job");
			System.out.println(" 5. Exit");
			num = input.nextInt();
			if(num == 1) {
				parttimeJobManager.addParttimejob();
			}
			else if(num == 2) {
				parttimeJobManager.deleteParttimejob();
			}
			else if(num == 3) {
				parttimeJobManager.editParttimejob();
			}
			else if(num == 4) {
				parttimeJobManager.viewParttimejob();
			}
			else {
				continue;
			}
		}

	}


}