package classpart10;

public class ClassEx10 {
//	멤버 변수
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	
//	학생 index 담는 변수
	int student = -1;
	
//	----------------------------------------------------------
	
//	생성자
	public ClassEx10() {};
//	1. 전교성적 출력 함수
	public void choice1() {
		for(int i = 0; i < arHakbun.length; i++) {
			System.out.println((i+1) + ". " + arHakbun[i] + "학번" + "(" + arScore[i] + "점)");
		}
	}
	
//	2. 전교 1등 성적 출력 함수
	public void choice2() {
		int top = 0;
		
		for(int i = 0; i < arHakbun.length; i++) {
			if(top < arScore[i]) {
				student = i;
				top = arScore[i];
			}
		}
		System.out.println("1등 학생 : " + arHakbun[student] + "학번 (" + top + "점)");
//		return top;
//		return student;
	}
	
//	3. 전교 꼴등 성적 출력 함수
	public void choice3() {
		int bottom = arScore[0];
		
		for(int i = 0; i < arHakbun.length; i++) {
			if(bottom > arScore[i]) {
				student = i;
				bottom = arScore[i];
			}
		}
		System.out.println("꼴등 학생 : " + arHakbun[student] + "학번 (" + bottom + "점)");
	}
	
//	4. 학번 입력 받아 성적 출력 함수
//	단, 존재 하지 않는 학번 예외처리 할 것
	public int choice4(int user) {
		int score = 0;
		for(int i = 0; i < arHakbun.length; i++) {
			if(arHakbun[i] == user) {
				score = arScore[i];
				student = i;
			}
		}
		
		return score;
	}
}
