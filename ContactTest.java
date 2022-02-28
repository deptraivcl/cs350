package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	@Test
	void testContact() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
			assertTrue(contact.getContactID().equals("CS320"));
			assertTrue(contact.getFirstName().equals("Anh"));
			assertTrue(contact.getLastName().equals("Tran"));
			assertTrue(contact.getNumber().equals("0123456789"));
			assertTrue(contact.getAddress().equals("3805 E Glinsan"));				
	}
	@Test
	void testContacttoolong() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setContactID("12345678907");
		});
			
	}
	@Test
	void testContactisnull() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setContactID(null);
		});
	}
	
	@Test
	void testFirstnametoolong() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("Anhsdafwersasdf");
		});
			
	}
	@Test
	void testFirstnameisnull() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testLastnametoolong() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName("Anhsdafwersasdf");
		});
			
	}
	@Test
	void testLastnameisnull() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});
	}
	
	@Test
	void testNumbertoolong() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setNumber("123456789101112");
		});
			
	}
	@Test
	void testNumberisnull() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setNumber(null);
		});
	}
	
	@Test
	void testAddresstoolong() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("Anhsdafwersasdsadfsdafsdfsadfsdfasdfdsdfsadfsadfsdf");
		});
			
	}
	@Test
	void testAddressisnull() {
		Contact contact = new Contact("CS320", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});
	}
}