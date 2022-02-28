package contact;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	ContactService service = new ContactService();
	
	@Test
	void testAddContact() {
		service.addContact("Anh", "Tran", "0123456789", "3805 E Glisan");
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test for null
			service.addContact(null, null, null, null);
		}); 
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test for invalid first name
			service.addContact("Anhsadfasdfsadfasdf", "Tran", "0123456789", "3805 E Glisan");
		}); 
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test for invalid last name
			service.addContact("Anh", "Transadfsadfsdafsdafsdaf", "0123456789", "3805 E Glisan");
		}); 
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test for invalid number
			service.addContact("Anh", "Tran", "12343", "3805 E Glisan");
		}); 

		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test for invalid address
			service.addContact("Anh", "Tran", "0123456789", "3805 E Glisansssssssssssssssssssssssssssssssssssssssssssssssssss");
		}); 

	}
	
	@Test
	void testDeleteContact() {
		Contact contact = new Contact("CS32012345", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test null
			service.deleteContact(null);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test none available ID
			service.deleteContact("CS123");
		});
	}
	
	@Test
	void testUpdateContact() {
		Contact contact = new Contact("CS32012345", "Anh", "Tran", "0123456789", "3805 E Glinsan" );
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> { //test null
			service.updateContact(null,null,null,null,null);
		});
		
		
		
	}
}