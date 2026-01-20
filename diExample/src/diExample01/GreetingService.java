package diExample01;

public class GreetingService {
	public void mygreet(String name, Greeting greeting) {
		String gree = greeting.greet(name);
		System.out.println(gree);
	}
}
