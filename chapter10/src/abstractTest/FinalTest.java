package abstractTest;

class define {
	public static final int Min = 1;
	public static final int Max = 999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MONIG = "good monig";
}

public class FinalTest {

	public static void main(String[] args) {
//		Final 예약어
//		final 변수는 값이 변경될 수 없는 상수.
//		예) public static final double pi = 3.14  // 메소드
//		재할당 -> pi = 3.0 불가능
//		final 1 = 20; // 변수
//		final 메소드는 하위 클래스에 재정의 할 수 없다.
//		final 클래스는 상속되지 않는다.
//		선언과 동시에 할당되거나 생성자에서 한 번만 할당가능.
		
//		static 키워드로 작성된 변수는 인스턴스 하지 않아도 접근 가능
		System.out.println(define.GOOD_MONIG);
		
//		define.PI = 3.1;  // final 대할당 안됨
		
		double num = define.PI * 1000;
		System.out.println(num);
	}

}
