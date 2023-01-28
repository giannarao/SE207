
public class CCPayment implements PaymentStrategy {
	String name;
	String cardNumber;
	String expDate;
	String cvv;
	String zip;
	
	CCPayment(String name, String cardNumber, String zip, String expDate, String cvv){
		this.name = name;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvv = cvv;
		this.zip = zip;
	}
	

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " with CC ending in " + cardNumber.substring(12));
		
	}

}
