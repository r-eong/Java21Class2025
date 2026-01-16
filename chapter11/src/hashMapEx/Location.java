package hashMapEx;

import java.util.HashMap;

public class Location {
//	멤버변수는 접근 제어자 private 사용
	private String city;  // 도시
	private int latitude;  // 위도
	private int longitude;  // 경도
	
//	HashMap<Integer, Integer> locations = new HashMap<Integer, Integer>();
	
	public Location() {}
//	
	public Location(String city, int latitude, int longitude) {
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

//	자바 최상위 클래스 : Object
//	Object 에는 toString() 메소드 디폴트 존재. String 데이터 타입으로 출력할 때 사용
//	현재 메소드의 최상위 클래스 보는 방법 : 컨트롤 + T 
	@Override  // 재정의 필수!!
	public String toString() {  // 출력문구 만든거임! 
		return city + " " + latitude + " " + longitude;
	}
}
