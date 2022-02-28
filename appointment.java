package appointment;
import java.util.Date;


class Appointment {
	private String appointmentID, appointmentDescription;
	private Date appointmentDate;
	
	//constructor
	Appointment() {
		this.appointmentID = "0123456789";
		this.appointmentDate = new Date();
		this.appointmentDescription = "Default";
	}
	
	Appointment(String id) {
		setAppointmentID(id);
		this.appointmentDate = new Date();
		this.appointmentDescription = "Default";
	}
	
	Appointment(String id, Date date) {
		setAppointmentID(id);
		setAppointmentDate(date);
		this.appointmentDescription = "Default";
	}

	Appointment(String id, Date date, String description) {
		setAppointmentID(id);
		setAppointmentDate(date);
		setAppointmentDescription(description);
	}
	
	//update function
	
	public void setAppointmentID(String id) {
		if(id == null) {
			throw new IllegalArgumentException("Appointmenet ID cannot be null.");
		}
		else if (id.length()>10) {
			throw new IllegalArgumentException("Appointment ID must be shorter than 10 digits.");
		}	
		else{
			this.appointmentID = id;
		}
	}
	
	public void setAppointmentDate(Date date) {
		if(date == null) {
			throw new IllegalArgumentException("Appointmenet date cannot be null.");
		}
		else if (date.before(new Date())) {
			throw new IllegalArgumentException("Appointment date cannot be in the past");
		}	
		else{
			this.appointmentDate = date;
		}
	}
	
	public void setAppointmentDescription(String description) {
		if(description == null) {
			throw new IllegalArgumentException("Appointmenet description cannot be null.");
		}
		else if (description.length()>50) {
			throw new IllegalArgumentException("Appointment description must be shorter than 50 characters.");
		}	
		else{
			this.appointmentDescription = description;
		}
	}
	
	//get function
	 public String getAppointmentID() { return appointmentID; }
	 
	 public Date getAppointmentDate() { return appointmentDate; }
	 
	 public String getAppointmentDescription() { return appointmentDescription; }
}