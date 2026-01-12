package privateEx;

public class PrivateTest {
//	public 접근제어자를 이용하여 멤버변수를 정의한다
//	public int day;
//	public int month;
//	public int year;
	
//	private 접근제어자는 같은 클래스에서만 접근을 허용한다
//	정보의 은닉화!
	private int day;
	private int month;
	private int year;
	
//	private 접근제어자는 getter, setter 를 통해 접근 가능
	public int getDay() {
		return day;  // 보내줘야하니까
	}
	public void setDay(int day) {
		if(month == 2) {  // 예외처리
			if(day < 1 || day > 28) {
				System.out.println("날짜오류");
			}
		}else {
			this.day = day;  // 받아와야하니까
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
