package Task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
	@Test
	void testTask() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
			assertTrue(task.gettaskID().equals("CS320"));
			assertTrue(task.gettaskName().equals("Anh"));
			assertTrue(task.gettaskObject().equals("get homework done"));			
	}
	@Test
	void testTasktoolong() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskID("1234567890716354689166");
		});
			
	}
	@Test
	void testTaskisnull() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskID(null);
		});
	}
	
	@Test
	void testTasknametoolong() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskName("Anhsdafwersasdf");
		});
			
	}
	@Test
	void testTasknameisnull() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskName(null);
		});
	}
	
	@Test
	void testTaskObjecttoolong() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskObject("sadf dsfsdafsdkjfhjlksah df sdlkfosad lflsd fAnhsdafwersasdf");
		});
			
	}
	@Test
	void testTaskObjectisnull() {
		Task task = new Task("CS320", "Anh", "get homework done"  );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.settaskObject(null);
		});
	}
	
}