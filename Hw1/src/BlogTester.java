
public class BlogTester {

	public static void main(String[] args) {
		BlogClass blog1 = new BlogClass();
		
		
		UserClass user1 = new UserClass("gianna.rao@monmouth.edu", blog1, new Display());
		UserClass user2 = new UserClass("abc@monmouth.edu", blog1, new Save());
		UserClass user3 = new UserClass("123@monmouth.edu", blog1, new Text());
		
		blog1.postNewMessage(user1.email, "Title 1", "Message 1");
		
		blog1.postNewMessage(user2.email, "Title 2", "Message 2");
		
		blog1.postNewMessage(user3.email, "Title 3", "Message 3");
		


	}

}
