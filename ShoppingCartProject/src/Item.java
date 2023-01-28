
public class Item {
	
	private String itemCode;
	private double price;
	
	Item(String code, double price) {
		this.itemCode = code;
		this.price = price;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	public double getPrice() {
		return price;
	}
}
