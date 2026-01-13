package inheritance;

//부모 클래스인 ParentClass 를 자식 클래스인 ChildClass 에 상속
//상속 키워드 : extends
//자식클래스 이름 extends 부모클래스 이름
public class ChildClass extends ParentClass{
//	자식 클래스
	int a = 5;
	int b = 6;
	
//	기본 생성자
	public ChildClass(int a, int b) {
//		super();  // 부모의 디폴트 생성자 호출 (생략해도 컴파일러가 자동으로 추가해줌)
		System.out.println("childClass 생성자");
		this.a = a;
		super.setA(b);
	}
	
	public void childfun() {
//		this = 현재 클래스 (나)
		this.a  = 12;
//		super = 부모 클래스
//		부모의 멤버변수 a에 접근하여 값을 25로 변경
//		super.a = 25;
		
		System.out.println("=== child start ===");
		System.out.println("자식의 a : " + a + ", 부모의 a : " + super.a);
	}
}
