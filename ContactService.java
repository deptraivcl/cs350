package contact;
import java.util.ArrayList;
import java.util.UUID;

public class ContactService {
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	private String randomContactID;
	private Contact searchContacts(String ID) throws Exception{
		int i = 0;
		while(i< contactList.size()) {
			if(ID.equals(contactList.get(i).getContactID())) {
				return contactList.get(i);
			}
			i++;
		}
		throw new Exception("Not found."); 
	}
	private String randomContactID() { //random contact ID with 10 characters. 
		 randomContactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
		 return randomContactID;			 
	}
	public void addContact(Contact contact) {
		
		contactList.add(contact); // add new contact with unique ID
	}
	
	public void addContact(String firstName, String lastName, String number, String address) {
		
		Contact contact = new Contact(randomContactID(), firstName, lastName, number, address);
		
		contactList.add(contact); // add new contact with unique ID
	}
	
	public void updateContact(String ContactID, String firstName, String lastName, String number, String address) {
		for(Contact contact : contactList) {
			if(contact.getContactID().equals(ContactID)) {
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setNumber(number);
				contact.setAddress(address);
				System.out.println("Contact updated");
			}
		}
	}
	
	
	public void deleteContact(String ID) throws Exception {
		contactList.remove(searchContacts(ID));
	}
}