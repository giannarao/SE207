
public interface Blog {
	public void addObserver (User user);
	public void removeObserver (User currentUser);
	public void notifyObservers (String email, String blogTitle, String blogMesssage);
		
	}


