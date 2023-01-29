
public class Venmo implements PaymentStrategy {

	
	private String phoneNumber;
		
	Venmo(String phoneNumber){
		this.phoneNumber = phoneNumber;
		
	}

	@Override
	public void pay (double amount) {
		System.out.println("Paid " + amount + " with Venmo account with phone number ending in: " + phoneNumber.substring(6));
	

	}

}
