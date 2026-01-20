package diExample01;

public class JapaneseGreeting implements Greeting {
	@Override
	public String greet(String name) {
		return "こんにちは, " + name + "!";
	}
}
