package entities.enums;


public enum OrderStatus {
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;
	
	public OrderStatus next() {
		int i = this.ordinal();
		if(i == 3) i = 0;
		return OrderStatus.values()[i+1];
	}
	
}
