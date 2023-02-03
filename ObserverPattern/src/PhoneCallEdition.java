
public class PhoneCallEdition implements Subscriber {

	Publisher myPublisher;
	
	public PhoneCallEdition(Publisher newPublisher) {
		this.myPublisher = newPublisher;
		myPublisher.addSubscriber(this);
	}
	@Override
	public void receiveNews(String news) {
		System.out.println("Transcribing message: " + news);
		
	}

}
