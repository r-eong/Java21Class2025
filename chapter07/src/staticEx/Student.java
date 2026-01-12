package staticEx;

public class Student {
//	static 은 데이터 메모리 영역에 존재하며 서로다른 인스턴스에 같은 값을 공유한다
//	static 데이터타입 변수이름 -> 클래스 변수라 칭함
	
//	static 은 정적의미를 가짐
	static int serialNum = 1000;
	
	int studentId;
	String studentName;
	
//	디폴트 생성자
	public Student() {
		serialNum ++;
		studentId = serialNum;
	}
}
