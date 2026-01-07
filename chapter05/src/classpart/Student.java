package classpart;

// Student 라는 이름을 가진 클래스를 생성함
public class Student {  // = 클래스
//	property 또는 필드면, 멤버변수 를 작성
//	단, 데이터 타입은 자료의 형태를 보고 결정
	
//	학번
	int studentId;  // = 멤버변수
//	학생 이름
	String studentName;
//	학생 주소
	String adress;
//	학생 학년
	int grade;

//	method 또는 함수 생성
//	접근제어자 반환유무(void or 데이터 타입) 함수이름(){}
//	단, 반환할 값이 필요한 경우 반드시 return 반환할 값 필요
	
	public void showStudentInfo() {
		System.out.printf("%s 학생의 주소는 %s 이다.", studentName, adress);
		System.out.println();
	}
	
//	main() 메소드 생성후 출력
	public static void main(String[] args) {
//		홍길동, 개나리, 진달래 학생의 정보를 출력
//		반드시 먼저 진행해야 하는 작업
//		-> 인스턴스화(=객체화) 진행
		
//		st01, st02, st03 은 객체이다
		
		Student st01 = new Student();  // = 인스턴스화
		
		st01.studentName = "홍길동";
		st01.adress = "서울";
		
//		출력
		st01.showStudentInfo();
		
		Student st02 = new Student();
		st02.studentName = "개나리";
		st02.adress = "경기도";
		
		st02.showStudentInfo();
		
		Student st03 = new Student();
		st03.studentName = "진달래";
		st03.adress = "인천";
		
		st03.showStudentInfo();
		
		System.out.println(st01);  // classpart.Student@19469ea2
		System.out.println(st02);  // classpart.Student@13221655
		System.out.println(st03);  // classpart.Student@2f2c9b19
	}
}
