
public class TextMessageEdition implements Subscriber {

	Publisher myPublisher;
	
	public TextMessageEdition(Publisher newPublisher) {
		this.myPublisher = newPublisher;
		myPublisher.addSubscriber(this);
	}
	@Override
	public void receiveNews(String news) {
		System.out.println("Text Message: " + news);
		
	}

}
