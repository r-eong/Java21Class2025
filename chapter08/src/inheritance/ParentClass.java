package inheritance;

public class ParentClass {
//	부모 클래스
	protected int a = 10;
	protected int b = 20;
	
//	기본 생성자를 쓰지 않을거면 매개변수 생성자도 없어야됨
	public ParentClass() {
		System.out.println("=== 부모 생성자 ===");
	}
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	//	매개변수 생성자
	public ParentClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
//	메서드
	public void parentfun() {
		System.out.println("=== parentfun ===");
		System.out.println("부모 : " + a + ", " + b);
	}
}
