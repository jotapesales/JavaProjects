package entities;

public class OrderItem {
	private Integer quantity;
	private Product product;
	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public Double subTotal() {
		return product.getPrice()*quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	@Override
	public String toString() {
		return product.getName()+", $"+String.format("%.2f", product.getPrice())+
				" Quantity: "+quantity+", Subtotal: $"+subTotal()+"\n";
	}
}
