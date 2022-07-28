public class patientRecords {
	
	private String UID;
	private String firstName;
	private String lastName;
	private String middleName;
	private String birthDay;
	private String gender;
	private String Address;
	private String phoneNo;
	private String nationalID;
	private char savePatientRecord;
	
	public patientRecords(String UID, String firstName, String lastName, String middleName, String birthDay, String gender, String Address, String phoneNo, String nationalID) {
		 	this.UID = UID;
	        this.lastName = lastName;
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.birthDay = birthDay;
	        this.gender = gender;
	        this.Address = Address;
	        this.phoneNo = phoneNo;
	        this.nationalID= nationalID;
	    }
	}