import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class managePatientRecords {

	public void addNewPatient(ArrayList<patientRecords> patientLists) {
		String firstName;
		String lastName, middleName, birthDay, gender, address, phoneNumber, natID, userChoice;
		
		Scanner input = new Scanner(System.in);

		System.out.println(Calendar.getInstance().get(Calendar.MONTH));
		System.out.println("ADD NEW PATIENT: ");
		
		System.out.print("First Name: ");
		firstName = input.nextLine();
		
		System.out.print("Last Name: ");
		lastName = input.nextLine();
		
		System.out.print("Middle Name: ");
		middleName = input.nextLine();
		
		System.out.print("Birthday (YYYMMDD): ");
		birthDay = input.nextLine();
		
		do {
			System.out.print("Gender2: ");
			gender = input.nextLine();
		} while (gender.charAt(0) != 'F' && gender.charAt(0) != 'f' && gender.charAt(0) != 'M' && gender.charAt(0) != 'm');
		
		System.out.print("Address: ");
		address = input.nextLine();
		
		System.out.print("Phone No.: ");
		phoneNumber = input.nextLine();
		
		System.out.print("National ID no.: ");
		natID = input.nextLine();
		
		System.out.print("Save Patient Record [Y/N]? ");
		do {
			userChoice = input.nextLine();
		} while (userChoice.charAt(0) != 'y' && userChoice.charAt(0) != 'Y' && userChoice.charAt(0) != 'N' && userChoice.charAt(0) != 'n');
		
		if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
			try {
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter("patients.txt", true));
				fileWriter.write(generateUID(patientLists) +";" + firstName + ";" + lastName + ";" + middleName + ";" + birthDay + ";" + gender + ";" + address + ";" + phoneNumber + ";" + natID +"\n");
			    fileWriter.close();
			}
	        // Catch block to handle if exceptions occurs
	        catch (IOException e) {
	            // Print the exception on console
	            // using getMessage() method
	            System.out.print(e.getMessage());
	        }
			patientLists.add(new patientRecords(generateUID(patientLists), firstName, lastName, middleName, birthDay, gender, address, phoneNumber, natID));
		}

		
		
		
	}
	/*
	public static void searchPatientRecord(ArrayList<patientRecords> patientLists) {
		
	}
	*/
	private String generateUID (ArrayList<patientRecords> patientLists) {
		
		int numberOfPatient;
		String month;
		char D1, D2, D3;
		String EE;
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int monthDraft = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		switch (monthDraft) {
			case 0:
				month = "01";
				break;
		case 1: 
			month = "02";
			break;
		case 2:
			month = "03";
			break;
		case 3:
			month = "04";
			break;
		case 4:
			month = "05";
			break;
		case 5:
			month = "06";
			break;
		case 6: 
			month = "07";
			break;
		case 7:
			month = "08";
			break;
		case 8:
			month = "09";
			break;
		case 9: 
			month = "10";
			break;
		case 10:
			month = "11";
			break;
		case 11:
			month = "12";
			break;
		default:
			month="13";
			break;
		}
		/*
		if (day == 1)
		{
			numberOfPatient = 0;
		}
		
		else
		{
			numberOfPatient = patientLists.size();
		}*/
		
        
		numberOfPatient = patientLists.size();
		D1 = alphabet.charAt(numberOfPatient/(26*26*100));
		//numberOfPatient = numberOfPatient % (26*26*100);
		D2 = alphabet.charAt(numberOfPatient/(26*100));
       // numberOfPatient = numberOfPatient % (26*99);
	    D3 = alphabet.charAt(numberOfPatient/100);
        //numberOfPatient = numberOfPatient % 100;

		numberOfPatient = patientLists.size();
	    
	    if (numberOfPatient < 10){
	            EE = 0 + String.valueOf(numberOfPatient); // the number will become string
	        }
	        else {
	            EE = String.valueOf(numberOfPatient);
	        }

		return "P" + year + month + D1 + D2 + D3 + EE;
	}
}
