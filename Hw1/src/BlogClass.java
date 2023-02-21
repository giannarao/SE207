import java.util.ArrayList;
import java.util.List;

public class BlogClass implements Blog {
	
	List<User> usersList = new ArrayList<>();
	
	@Override
	public void addObserver(User user) {
		usersList.add(user);
		
	}

	@Override
	public void removeObserver(User currentUser) {
		usersList.remove(currentUser);
		
	}

	@Override
	public void notifyObservers(String email, String blogTitle, String blogMessage) {
		for (User user: usersList) {
			if (user.getEmail() == email){
			user.acceptMessage(email, blogTitle, blogMessage);
			}
		}
		
	}
	
	public void postNewMessage(String email, String blogTitle, String blogMessage) {
		notifyObservers(email, blogTitle, blogMessage);
		
		
	}

}



