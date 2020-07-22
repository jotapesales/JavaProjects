package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public double totalValue() {
		return valuePerHour*hours;
	}

	public HourContract(Double valuePerHour, Integer hours) {
		this.date = new Date();
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}
	
	
}
