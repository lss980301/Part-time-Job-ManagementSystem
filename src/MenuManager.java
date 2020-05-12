import java.util.Scanner;

public class MenuManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ParttimeJobManager parttimeJobManager = new ParttimeJobManager(input);

		int num= -1;
		while(num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				parttimeJobManager.addParttimejob();
				break;
			case 2:
				parttimeJobManager.deleteParttimejob();
				break;
			case 3:
				parttimeJobManager.editParttimejob();
				break;
			case 4:
				parttimeJobManager.viewParttimejobs();
				break;
			default:
				continue;
			}
		}

	}

	public static void showMenu() {
		System.out.println("*** Part-time job Management System Menu ***");
		System.out.println(" -- Select one number between 1-5 -- ");
		System.out.println(" 1. Add Part-time job");
		System.out.println(" 2. Delete Part-time job");
		System.out.println(" 3. Edit Part-time job");
		System.out.println(" 4. View Part-time jobs");
		System.out.println(" 5. Exit");

	}
}