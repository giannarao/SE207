import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class ShoppingCart {
	//List of items
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList <Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	public double calculateTotal() {
		double sum = 0;
		for(Item item: items) {
			sum += item.getPrice();
		}
		return sum;
	}
	public void checkout(PaymentStrategy payBy) {
		double totalAmount = this.calculateTotal();
		payBy.pay(totalAmount);

	}

}
