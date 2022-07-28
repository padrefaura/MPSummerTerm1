import java.util.Scanner;
import java.util.ArrayList;

public class mainMenus {
	private managePatientRecords mPR;
	public void managePatients (ArrayList<patientRecords> patientLists) {
		managePatientRecords mPR = new managePatientRecords();
		 String choice;
	     Scanner input = new Scanner(System.in);
	        
	        do{
	            System.out.println("Manage Patient Records");
	            System.out.println("[1] Add New Patient");
	            System.out.println("[2] Edit Patient Record");
	            System.out.println("[3] Delete Patient Record");
	            System.out.println("[4] Search Patient Record");
	            System.out.println("[X] Return to Main Menu");
	            System.out.print("\nSelect a transaction: ");

	            choice = input.nextLine();
	            System.out.println();

	        } while ((choice.charAt(0) != '1' && choice.charAt(0) != '2' && choice.charAt(0) != '3' && choice.charAt(0) != '4' && choice.charAt(0) != 'X' && choice.charAt(0) != 'x') || choice.length() != 1);
	        
	        switch (choice) {
	        	 case "1" : mPR.addNewPatient(patientLists);
	        	 		  break;
	        	// case 2: managePatientRecords.editPatientRecord;
	        	// case 3: managePatientRecords.deletePatientRecord;
	        	// case 4: managePatientRecords.editPatientRecord;
	        }
	}
	
}
