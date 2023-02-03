import java.util.ArrayList;
import java.util.List;

public class HawksNews implements Publisher {
	
	List<Subscriber> subscribersList = new ArrayList<>();
	
	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribersList.add(subscriber);
		
	}
	@Override
	public void removeSubscriber(Subscriber currentSubscriber) {
		subscribersList.remove(currentSubscriber);
		
	}
	@Override
	public void notifySubscribers(String news) {
		for (Subscriber subscriber: subscribersList) {
			subscriber.receiveNews(news);
		}
		
	}
	
	public void acceptNews(String news) {
		notifySubscribers(news);
		
	}

	

}
