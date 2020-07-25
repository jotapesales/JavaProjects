package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class Reservation  {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer roomNumber, String checkIn, String checkOut) {
		updateDates(checkIn, checkOut);
		this.roomNumber = roomNumber;
	}

	public void updateDates(String checkIn, String checkOut) {
		Date now = new Date();
		try {
			Date cI = sdf.parse(checkIn);
			Date cO = sdf.parse(checkOut); 
			if(cI.before(now) || cO.before(now)) 
				 throw new DomainException("Reservation dates for update must be future.\n");
			if(!cO.after(cI))
				throw new DomainException("Check-out date must be after check-in date.");
			this.checkIn = cI;
			this.checkOut = cO;
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(DomainException i) {
			System.out.println("Error in reservation: "+i.getMessage());
		}
	}
	
	
	public Integer duration() {
		return (int) TimeUnit.MILLISECONDS.toDays(checkOut.getTime() - checkIn.getTime());
	}
	
	@Override
	public String toString() {
		return "Room "+roomNumber+", check-in:"+sdf.format(checkIn)+
				", check-out:"+sdf.format(checkOut)+", "+duration()+" nights.";
	}
}
