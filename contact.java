package contact;
class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
	//The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
	//The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
	//The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
	//The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
	
	private static final String Initial_value_string = "Initial";
	private static final String Initial_value_number = "0000000000";// number is exactly at 10. 
	
	//constructor
	Contact(){
		this.contactID = Initial_value_string;
		this.firstName =  Initial_value_string;
		this.lastName =  Initial_value_string;
		this.number =  Initial_value_number;
		this.address =  Initial_value_number;
	}
	Contact(String contactID){
		setContactID(contactID);
		this.firstName =  Initial_value_string;
		this.lastName =  Initial_value_string;
		this.number =  Initial_value_number;
		this.address =  Initial_value_number;
	}
	Contact(String contactID, String firstName){
		setContactID(contactID);
		setFirstName(firstName);
		this.lastName =  Initial_value_string;
		this.number =  Initial_value_number;
		this.address =  Initial_value_number;
	}
	Contact(String contactID, String firstName, String lastName){
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		this.number =  Initial_value_number;
		this.address =  Initial_value_number;
	}
	Contact(String contactID, String firstName, String lastName, String number){
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		this.address =  Initial_value_number;
	}
	Contact(String contactID, String firstName, String lastName, String number, String address){
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		setAddress(address);
	}
	
	//get info
	protected final String getContactID() {
		return contactID;
	}
	
	protected final String getFirstName() {
		return firstName;
	}
	
	protected final String getLastName() {
		return lastName;
	}
	
	protected final String getNumber() {
		return number;
	}
	
	protected final String getAddress() {
		return address;
	}
	
	//now we just need to check to make sure that all attributes are within the contact class requirement.
	public void setContactID(String contactID) {
		if(contactID == null) {
			throw new IllegalArgumentException("ContactID cannot be null.");
		}
		else if (contactID.length()>10) {
			throw new IllegalArgumentException("ContactID must be shorter than 10 digits.");
		}
		
		else{
			this.contactID = contactID;
		}
	}
	
	protected void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("Field cannot be empty.");
		}
		else if (firstName.length()>10) {
			throw new IllegalArgumentException("Name must be less than 10 characters.");
		}
		else {
		this.firstName = firstName;
		}
	}
	
	protected void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("Field cannot be empty.");
		}
		else if(lastName.length()>10) {
			throw new IllegalArgumentException("Name must be less than 10 characters.");
		}
		else {
			this.lastName = lastName;
		}
		
		
	}
	protected void setNumber(String number) {
		String regexTest = "[0-9]+"; 
		if(number == null){
			throw new IllegalArgumentException("Number cannot be null.");
		}
		else if(!(number.length()==10)) {
			throw new IllegalArgumentException("Number must have a length of 10.");
		}
		else if(!(number.matches(regexTest))) {
			throw new IllegalArgumentException("Only numbers are allowed for phone numbers.");
		}
		else{
			this.number = number;
		}
	}
	
	public void setAddress(String address) {
		if(address == null){
			throw new IllegalArgumentException("Address field may not be empty.");
		}
		else if(address.length()>30) {
			throw new IllegalArgumentException("Address max length is 30.");
		}
		else {
			this.address = address;
		}
	}

	
}