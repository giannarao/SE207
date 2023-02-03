
public class OnlineEdition implements Subscriber {

	Publisher myPublisher;
	
	public OnlineEdition(Publisher newPublisher) {
		this.myPublisher = newPublisher;
		myPublisher.addSubscriber(this);
	}
	
	
	@Override
	public void receiveNews(String news) {
		System.out.println("Showing news on webpage as: " + news);
		
	}

}
