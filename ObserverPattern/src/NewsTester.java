
public class NewsTester {

	public static void main(String[] args) {
		HawksNews hawksNewsPublisher = new HawksNews();
		
		Subscriber webSubscriber = new OnlineEdition(hawksNewsPublisher);
		Subscriber messageSubscriber = new TextMessageEdition(hawksNewsPublisher);
		Subscriber phoneSubscriber = new PhoneCallEdition(hawksNewsPublisher);
		
		hawksNewsPublisher.acceptNews ("Delayed Opening Monday due to snowy conditions");
		
		
		Subscriber appSubscriber = new MobileAppEdition(hawksNewsPublisher);
		
		hawksNewsPublisher.removeSubscriber(webSubscriber);

		
		hawksNewsPublisher.acceptNews ("Delayed Opening Tuesday");
		
		

	}

}
