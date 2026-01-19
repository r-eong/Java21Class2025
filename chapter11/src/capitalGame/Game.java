package capitalGame;

public class Game {
	private String country;  // 나라 
	private String city;  // 수도
	
//	Java 는 저장하고 컴파일 하면 JVM이 기본 생성자를 제일 먼저 로드한다.
	public Game() {}
	
	public Game(String country, String city) {
		this.country = country;
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
