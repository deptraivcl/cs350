package appointment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

class AppointmentService {
	final private List<Appointment> appointmentList = new ArrayList<>();
	
	  private Appointment searchAppointment(String id) throws Exception {
		    int index = 0;
		    while (index < appointmentList.size()) {
		      if (id.equals(appointmentList.get(index).getAppointmentID())) {
		        return appointmentList.get(index);
		      }
		      index++;
		    }
		    throw new Exception("No appointment with that ID");
		  }

	private String UniqueId() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	
	public void newAppointment() {
	    Appointment appt = new Appointment(UniqueId());
	    appointmentList.add(appt);
	  }

	public void newAppointment(Date date) {
	    Appointment appt = new Appointment(UniqueId(), date);
	    appointmentList.add(appt);
	  }

	public void newAppointment(Date date, String description) {
	    Appointment appt = new Appointment(UniqueId(), date, description);
	    appointmentList.add(appt);
	  }

	public void deleteAppointment(String id) throws Exception {
	    appointmentList.remove(searchAppointment(id));
	  }
	
	
}