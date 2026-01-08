package classpart10;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		스캐너
//		scan <- 이건 참조변수!
//		Scanner(System.in) <- 이건 생성자임!
		Scanner scan = new Scanner(System.in);
//		객체화
		ClassEx10 ce10 = new ClassEx10();
//		타이틀 지정
		ce10.name = "메가 IT 고등학교";
//		반복문 상태
		boolean now = true;
		
//		반복문 시작
		while(now) {
//			타이틀
			System.out.println("== " + ce10.name + " ==");
//			메뉴
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등 성적확인");
			System.out.println("3. 꼴등 성적확인");
			System.out.println("4. 성적조회");
			System.out.println("0. 종료");
//			메뉴 선택 스캐너
			int menu = scan.nextInt();
			
//			1. 전교성적 출력 함수
			if(menu == 1) {
				ce10.choice1();
				
//			2. 전교 1등 성적 출력 함수
			}else if(menu == 2) {
				ce10.choice2();
				
//			3. 전교 꼴등 성적 출력 함수
			}else if(menu == 3) {
				ce10.choice3();
				
//			4. 학번 입력 받아 성적 출력 함수
			}else if(menu == 4) {
				System.out.println("학번을 입력하세요 >>");
				int user = scan.nextInt();
//				student 값을 바꿔주기 위해서 출력은 나중에 함!
				ce10.choice4(user);
				
				if(ce10.student == -1) {
					System.out.println("존재하지 않는 학번입니다.");
				}else {
					System.out.println(ce10.choice4(user) + "점");
				}
				
//			종료
			}else if(menu == 0){
				System.out.println("종료");
				now = false;
			}else {
				System.out.println("메뉴를 다시 확인하세요");
			}
		}

	}

}
