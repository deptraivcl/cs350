package Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {
	private String taskID = "";
	private String taskName = "CS320";
	private String taskObject = "Finish all your homework";
	private String badName = "The name is probably way too long for the name of the task";
	private String badObject = "The nobject is probably way too long for the name of the task. It should not be more than 50 characters and it should not be null";
	

	 @Test //test null name
	  void testNullNameNewTask() {
	    TaskService service = new TaskService();
	    service.newTask(taskName);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newTask(null);
		});
	  }
	  
	
	 @Test //test bad long name
	  void testBadNameNewTask() {
	    TaskService service = new TaskService();
	    service.newTask(taskName);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newTask(badName);
		});
	  }

	 @Test //test null object
	  void testNullObjectNewTask() {
	    TaskService service = new TaskService();
	    service.newTask(taskName);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newTask(taskName, null);
		});
	  }
	 
	 @Test // test bad long object
	  void testBadObjectNewTask() {
	    TaskService service = new TaskService();
	    service.newTask(taskName, taskObject);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newTask(taskName, badObject);
		});
	  }
	 
	 @Test //test delete contact with null value of taskID
	  void testDelete() {
	    TaskService service = new TaskService();
	    service.newTask(taskName, taskObject);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteTask(taskID);
		});
	  }
	 
	 @Test //test delete contact with null value of taskID
	  void testUpdateName() {
	    TaskService service = new TaskService();
	    service.newTask(taskName, taskObject);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateName(taskID, taskName);
		});
	  }
	 
	 @Test //test delete contact with null value of taskID
	  void testUpdateObject() {
	    TaskService service = new TaskService();
	    service.newTask(taskName, taskObject);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateObject(taskID, taskObject);
		});
	  }
}