package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
	private final List<Task> taskList = new ArrayList<>(); // create a list of task
	// create a unique ID
	  private String newId() {
		    return UUID.randomUUID().toString().substring(
		        0, Math.min(toString().length(), 10));
		  }
	 /// this is to search for Task ID. 
	  private Task searchForTask(String id) throws Exception {
		    int index = 0;
		    while (index < taskList.size()) {
		      if (id.equals(taskList.get(index).gettaskID())) {
		        return taskList.get(index);
		      }
		      index++;
		    }
		    throw new Exception("The Task does not exist!");
		  }
	  
	public void newTask() {
		    Task task = new Task(newId());
		    taskList.add(task);
		  }

	public void newTask(String taskName) {
		    Task task = new Task(newId(), taskName);
		    taskList.add(task);
		  }

	public void newTask(String taskName, String taskObject) {
		    Task task = new Task(newId(), taskName, taskObject);
		    taskList.add(task);
		  }

	public void deleteTask(String taskID) throws Exception {
		    taskList.remove(searchForTask(taskID));
		  }

	public void updateName(String id, String name) throws Exception {
		    searchForTask(id).settaskName(name);
		  }

	public void updateObject(String taskID, String taskObject)
		      throws Exception {
		    searchForTask(taskID).settaskObject(taskObject);
		  }

	public List<Task> getTaskList() { return taskList; }
		
}