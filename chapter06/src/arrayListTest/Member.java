package arrayListTest;

public class Member {
//	멤버변수
	String name;
	String address;
	int age;
	
//	디폴드 생성자
	public Member() {};
	
//	매개변수 포함된 생성자
	public Member(String name, String address, int age) {
//		this 는 Member 클래스를 지칭한다
		this.name = name;
		this.address = address;
		this.age = age;
		
//		main() 메서드에서 생성할 때 입력한 매개변수의 값이 
//		this.name = "홍길동"
//		this.address = "서울"
//		this.age = 20
	}
	
//	출력 메서드
	public void printMember() {
		System.out.printf("이름 : %s\n주소 : %s\n나이 : %d\n", name, address, age);
	}
}
