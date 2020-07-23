package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items;
	private Client client;
	
	public Order(Client client) {
		super();
		this.moment = new Date();
		this.status = OrderStatus.PENDING_PAYMENT;
		this.items = new ArrayList<>();
		this.client = client;
	}
	
	public void changeOrderStatus() {
		this.status = this.status.next();
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(OrderItem i : items)
			sum+=i.subTotal();
		return sum;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+sdf.format(moment));
		sb.append("\nOrder status: "+status.toString()+"\n");
		sb.append(client);
		sb.append("\nOrder items:\n");
		for(OrderItem i : items) 
			sb.append(i);
		sb.append("Total price: $"+String.format("%.2f", total()));
		return sb.toString();
		
	}
	
}
