
public class Venmo implements PaymentStrategy {

	
	private String email;
	private String password;
		
	Venmo(String email, String password){
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay (double amount) {
		System.out.println("Paid " + amount + " with Venmo account: " + this.email);
	

	}

}
