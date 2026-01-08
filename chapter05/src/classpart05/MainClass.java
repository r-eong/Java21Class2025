package classpart05;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx05 ce05 = new ClassEx05();
		
//		answer 프린트 함수호출
		ce05.answerResult();
		
		System.out.println();
		
//		랜덤 함수호출
		ce05.randomResult();
		
		
//		비교 함수 호출
		System.out.print("\n정오표 : ");
		ce05.compare();
		
//		성적 함수호출
		ce05.totalSum();
	}

}
