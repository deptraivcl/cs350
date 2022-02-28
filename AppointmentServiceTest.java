package appointment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Date;

class AppointmentServiceTest {

	private Date todayDate = new Date();
	private Date pastDate = new Date(0);
	
	 @Test //test null appointment ID
	  void testNullID() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment();
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newAppointment(null);
		});
	  }	
	 
	 @Test //test null appointment date
	  void testNullDate() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment(todayDate);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newAppointment(null);
		});
	  }
	 
	 @Test //test  appointment past date
	  void testPastDate() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment(todayDate);
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newAppointment(pastDate);
		});
	  }
	 
	 @Test //test null appointment description
	  void testNullDescription() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment(todayDate, "new Description");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newAppointment(todayDate, null);
		});
	  }	
	 
	 @Test //test long  appointment description
	  void testLongDescription() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment(todayDate, "new Description");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.newAppointment(todayDate, "This is probably too long for a description because it should not be longer than 50 characters. I hope that this description is longer than 50 characters. 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		});
	  }	
	 
	 @Test //test delete contact with null value of taskID
	  void testDelete() {
	    AppointmentService service = new AppointmentService();
	    service.newAppointment(todayDate, "new Description");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteAppointment(null);
		});
	  }
	 
	 
}