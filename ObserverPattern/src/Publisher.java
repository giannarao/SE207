
public interface Publisher {
	public void addSubscriber (Subscriber subscriber);
	public void removeSubscriber (Subscriber currentSubscriber);
	public void notifySubscribers (String news);
		
	}


