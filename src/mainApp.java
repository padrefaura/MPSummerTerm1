import java.util.ArrayList;
import java.util.Scanner;

public class mainApp extends mainMenus {
	private mainMenus maMe;
	public static void main(String[] args) {
			mainMenus maMe = new mainMenus();
			int choice;
			ArrayList<patientRecords> patientLists = new ArrayList<>();
			
			Scanner input = new Scanner(System.in);
			
			do {
				
				do {
					System.out.println("Medical Laboratory Information System");
					System.out.println("[1] Manage Patient Records");
					System.out.println("[2] Manage Services");
					System.out.println("[3] Manage Laboratory Results");
					System.out.println("[4] Exit");
					
					System.out.println("\nSelect a transaction: ");
					
					choice = input.nextInt();
				} while (choice < 1 || choice > 4);
				
				switch (choice) {
				case 1:
					maMe.managePatients(patientLists);
					break;
				case 2:
					// manage services function
					break;
				case 3:
					// manage laboratory results
					break;
				}
				
			} while (choice != 4);
			
		System.out.println("Exited");
	}
}
