package classpart;

import java.util.Random;
import java.util.Scanner;

public class Person {
	String name;
	float height;
	float weight;
	
//	생성자란? 객체를 초기화하여 생성해주는 역할을 함
//	디폴트 생성까지 존재하지 않으면 컴파일러가 자동으로 생성해준다
//	단, 매개변수 생성자가 존재하고, 디폴트 생성자가 존재하지 않을 때는
//	디폴트 생성자를 컴파일러가 자동으로 생성해주지 않는다
	
//	default 생성자
//	생성자 이름은 반드시 클래스 이름과 같아야 한다
//	생성자는 여러개 만들 수 있다. 단, 똑같은 형식으로 작성금지
//	public Person() {} // 기본 생성자  <- 없으면 안됨!!
//	└> 생성자는 없을거면 아얘 안 쓰는게 나음! 하지만? 기본(default) 생성자는 되도록 꼭!! 써주자!
	
//	↓ 없어도 됨!!
	public Person(String name) {
//		여기서 this 는 Person 클래스의 멤버변수를 의미함
//		멤버변수 name 에서 생성자의 매개변수 이름을 넣어주라는 의미  
		this.name = name;
	}
	
	public Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
//		디폴트 생성자를 생성하지 않은채 아래처럼 기본 생성자를 객체화 할 수 없다
//		이유 : 이미 매개변수 생성자가 2개나 존재하므로
//		컴파일러가 디폴트 생성자를 자동으로 생성하지 않는다
//		Person pe = new Person();  // 인스턴스
		
//		Random ran = new Random();
//		Scanner 클래스는 디폴트 생성자가 존재하지 않는다
//		이유는 입력받는 inputstream 이 키보드인지 네트워크인지 구분이 필요하기 때문
//		고로, Scanner scan = new Scanner(System.in);
//		매개변수 생성자만 존재한다
//		Scanner scan = new Scanner();  // System.in << 이게 없으면 빨간줄/오류 임!
		
//		pe02 = 참조변수
//		클래스는 반드시 객체화해서 사용해야 함을 주의!!
		Person pe02 = new Person("홍길동");  // = 인스턴스화 = 객체화
		Person pe03 = new Person(178, 100);
		
		System.out.println(pe02.name);
		System.out.println(pe03.height);
		System.out.println(pe03.weight);
	}
}
