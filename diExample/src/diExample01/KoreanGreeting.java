package diExample01;

public class KoreanGreeting implements Greeting {
	@Override
	public String greet(String name) {
		return "안녕하세요, " + name + "님!";
	}
}
