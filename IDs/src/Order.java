
public class Order {
	private String orderID;
	
	Order(){
		NewOrderIDGenerator orderGen = NewOrderIDGenerator.getInstance();
		this.orderID = orderGen.getNextOrderID();
	}
	public String getOrderID() {
		return this.orderID;
	}
}
