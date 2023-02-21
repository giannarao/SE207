
public class UserClass implements User {
	String email;
	Blog myBlog;
	StrategyPattern myStrategy;
	
	public UserClass(String email, Blog myBlog, StrategyPattern myStrategy) {
		this.email = email;
		this.myBlog = myBlog;
		this.myStrategy = myStrategy;
		
		this.myBlog.addObserver(this);
		
		
	}
	
	@Override
	public String getEmail() {
		return this.email;
	}
	
	public void acceptMessage(String email, String blogTitle, String blogMessage) {
		myStrategy.processMessage(email, blogTitle, blogMessage);
	}

	

}
