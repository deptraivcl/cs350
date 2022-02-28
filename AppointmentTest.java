package appointment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class AppointmentTest {
	private Date todayDate = new Date();
	private Date pastDate = new Date(0);
	
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
			assertTrue(appointment.getAppointmentID().equals("0123456789"));
			assertTrue(appointment.getAppointmentDate().equals(todayDate));
			assertTrue(appointment.getAppointmentDescription().equals("tooth appointment"));			
	}

	@Test
	void testAppointmentIDisNull() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentID(null);
		});		
	}
	
	@Test
	void testAppointmentIDisLong() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentID("0123155468976496894");
		});		
	}
	
	@Test
	void testAppointmentDateisNull() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentDate(null);
		});		
	}

	@Test
	void testAppointmentDateisPast() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentDate(pastDate);
		});		
	}
	
	@Test
	void testAppointmentDescriptionisNull() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentDescription(null);
		});		
	}
	
	@Test
	void testAppointmentDescriptionisLong() {
		Appointment appointment = new Appointment("0123456789", todayDate, "tooth appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setAppointmentDescription("This is probably too long for a description because it should not be longer than 50 characters. I hope that this description is longer than 50 characters. 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		});		
	}
}