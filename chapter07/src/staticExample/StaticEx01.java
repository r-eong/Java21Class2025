package staticExample;

public class StaticEx01 {
//	멤버변수
//	static : 데이터 메모리 영역에서 값 공유
	static int money = 0;
	
	String user;
	int atm;
	
//	디폴트 생성자
	public StaticEx01() {};
	
//	오버로딩이랑 StaticEx01 의 기본 생성자를 재정의하여 사용
//	반드시 재정의된 매개변수가 존재하는 생성자의 매개변수를 입력해야한다
	public StaticEx01(String user) {
		this.user = user;
	}
	
//	입금 메서드
	public void addMoney(int atm) {
		money += atm;
		System.out.println("atm : " + money);
	}
	
//	출금 메서드
	public void delMoney(int atm) {
		money -= atm;
		System.out.println("atm : " + money);
	}
	
//	출력 메서드
	public void printInfo() {
		System.out.println("name : " + this.user);
	}
}
