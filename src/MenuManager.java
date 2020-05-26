import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager{
	static EventLogger logger = new EventLogger("logP.txt");

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		ParttimeJobManager parttimeJobManager = getObject("parttimeJobManager.ser");
		if (parttimeJobManager == null) {
			parttimeJobManager = new ParttimeJobManager(input);
		}
		else {
			parttimeJobManager.setScanner(input);
		}

		selectMenu(input, parttimeJobManager);
		putObject(parttimeJobManager, "parttimeJobManager.ser");
	}

	public static void selectMenu(Scanner input, ParttimeJobManager parttimeJobManager) {
		int num= -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					parttimeJobManager.addParttimejob();
					logger.log("add a Parttimejob");
					break;
				case 2:
					parttimeJobManager.deleteParttimejob();
					logger.log("delete a Parttimejob");
					break;
				case 3:
					parttimeJobManager.editParttimejob();
					logger.log("edit a Parttimejob");
					break;
				case 4:
					parttimeJobManager.viewParttimejobs();
					logger.log("view a list of Parttimejob");
					break;
				default:
					continue;
				} 
			}
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1-5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
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

	public static ParttimeJobManager getObject(String filename) {
		ParttimeJobManager parttimeJobManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			parttimeJobManager = (ParttimeJobManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return parttimeJobManager;
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return parttimeJobManager;
	}

	public static void putObject(ParttimeJobManager parttimeJobManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(parttimeJobManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}		
}