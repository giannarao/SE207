
public class MobileAppEdition implements Subscriber {
	Publisher myPublisher;
	
	public MobileAppEdition(Publisher newPublisher) {
		this.myPublisher = newPublisher;
		myPublisher.addSubscriber(this);
	}
	
	@Override
	public void receiveNews(String news) {
		System.out.println("Mobile App: " + news);
		

	}

}
