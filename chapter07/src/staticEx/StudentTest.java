package staticEx;

import privateEx.PrivateTest;

public class StudentTest {

	public static void main(String[] args) {
//		객체화
		Student st1 = new Student();
//		static 으로 작성된 클래스 변수는 인스턴스화 하지 않아도 접근할 수 있다.
//		System.out.println(Student.serialNum);
//		System.out.println(st1.serialNum);
		
		Student st2 = new Student();
//		st2.serialNum++;
//		아무리 st2 참조변수 생성 다음에 serialNum 을 누적해도
//		데이터 메모리 영역에서 값을 모든 참조변수에 공유한다
//		System.out.println(st2.serialNum);
//		System.out.println(st1.serialNum);
		
//		System.out.println("=== st3 참조변수 ===");
		Student st3 = new Student();
		System.out.println(st1.studentId);
		System.out.println(st2.studentId);
		System.out.println(st3.studentId);
		
		System.out.println("=== serialNum 값은 공유됨 ===");
		
		System.out.println(st1.serialNum);
		System.out.println(st2.serialNum);
		System.out.println(st3.serialNum);
		
//		static class 변수는 인스턴스화 하지 않아도 접근할 수 있다
		System.out.println(Student.serialNum);
		
//		--------------------------------------------------------------
		
//		다른 패키지에 있는걸 인스턴스화함!
		
		PrivateTest pT = new PrivateTest();
		pT.setDay(10);
		System.out.println(pT.getDay());
	}

}
