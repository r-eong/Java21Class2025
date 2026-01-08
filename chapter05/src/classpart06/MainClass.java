package classpart06;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
//		객체화
		ClassEx06 ce06 = new ClassEx06();
		
		boolean now = true;
		
		while(now) {
//			계좌 정보 호출
//			ce06.print();
			System.out.println("----------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("----------------------");
			// i < ce06.arAcc.length 보다 i <= count가 더 나음! 그럼 if 안써도 됨
			for(int i = 0; i < ce06.arAcc.length; i++) {
				if(ce06.arAcc[i] != "") {
					System.out.println(ce06.arAcc[i] + "\t" + ce06.arPw[i] + "\t" + ce06.arMoney[i]);
				}
			}
			System.out.println("----------------------");

//			메뉴 호출
			ce06.menu();
			System.out.println("----------------------");
			System.out.println("[1]회원가입\n[2]로그인\n[3]로그아웃\n[4]입금\n[5]이체\n[6]잔액조회\n[0]종료");
			System.out.println("메뉴를 선택하세요 >>");
//			메뉴 선택
			int menuChoice = ce06.scan.nextInt();
			
//			1. 회원가입
			if(menuChoice == 1) {
				ce06.join();
				
//			2. 로그인
			}else if(menuChoice == 2) {
				ce06.login();
				
//			로그인 해야 이용 가능 메뉴
			}else if(ce06.loginCheck != -1) {
//				3. 로그아웃
				if(menuChoice == 3) {
					ce06.logout();
						
//				4. 입금
				}else if(menuChoice == 4) {
					ce06.addMoney();
						
//				5. 이체
				}else if(menuChoice == 5) {
					ce06.sandMoney();
						
//				6. 잔액조회
				}else if(menuChoice == 6) {
					ce06.checkMoney();
				}
				
//			로그인 안 했을 때
			}else if(ce06.loginCheck == -1 && 0 < menuChoice && menuChoice <=6){ 
				System.out.println("로그인 후 이용해주세요.");
				
//			0. 종료
			}else {
				System.out.println("종료되었습니다.");
				now = false;
			}
		}
	}
}
