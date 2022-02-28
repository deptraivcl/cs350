package Task;
class Task {
	
	private String taskID;
	private String taskName;
	private String taskObject;

	
	//The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
	//The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
	//The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
	
	private static final String Initial_value_string = "Initial";
	
	//constructor
	Task(){
		this.taskID = Initial_value_string;
		this.taskName =  Initial_value_string;
		this.taskObject =  Initial_value_string;
	}
	Task(String taskID){
		settaskID(taskID);
		this.taskName =  Initial_value_string;
		this.taskObject =  Initial_value_string;
	}

	Task(String taskID, String taskName){
		settaskID(taskID);
		settaskName(taskName);
		this.taskObject =  Initial_value_string;
	}
	
	Task(String taskID, String taskName, String taskObject){
		settaskID(taskID);
		settaskName(taskName);
		settaskObject(taskObject);
	}
	//get info
	protected final String gettaskID() {
		return taskID;
	}
	
	protected final String gettaskName() {
		return taskName;
	}
	
	protected final String gettaskObject() {
		return taskObject;
	}
	

	//now we just need to check to make sure that all attributes are within the contact class requirement.
	public void settaskID(String taskID) {
		if(taskID == null) {
			throw new IllegalArgumentException("TaskID cannot be null.");
		}
		else if (taskID.length()>10) {
			throw new IllegalArgumentException("TaskID must be shorter than 10 digits.");
		}
		
		else{
			this.taskID = taskID;
		}
	}
	
	protected void settaskName(String taskName) {
		if(taskName == null) {
			throw new IllegalArgumentException("Field cannot be empty.");
		}
		else if (taskName.length()>20) {
			throw new IllegalArgumentException("Name must be less than 20 characters.");
		}
		else {
		this.taskName = taskName;
		}
	}
	
	protected void settaskObject(String taskObject) {
		if(taskObject == null) {
			throw new IllegalArgumentException("Field cannot be empty.");
		}
		else if(taskObject.length()>10) {
			throw new IllegalArgumentException("Name must be less than 10 characters.");
		}
		else {
			this.taskObject = taskObject;
		}
		
	}
}