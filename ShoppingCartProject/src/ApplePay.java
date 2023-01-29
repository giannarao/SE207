
public class ApplePay implements PaymentStrategy {


	
	private String appleID;
	private String password;
	private String phoneNumber;
		
	ApplePay(String appleID, String password, String phoneNumber){
		this.appleID = appleID;
		this.password = password; 
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " with ApplePay: " + appleID + " with phone number ending in " + phoneNumber.substring(6));

	}

}
