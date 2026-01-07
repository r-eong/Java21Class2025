package multiexample;

import java.util.*;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean now = true;
		
//		로그인 상태
		int state = -1;
//		아이템 수량/횟수
		int cartCnt = 0;
		
		String[] ids = {"qwer", "javaking", "abcd"};  // 아이디
		String[] pws = {"1111", "2222", "3333"};  // 비밀번호
		String[] items = {"사과", "바나나", "딸기"};  // 상품목록
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];  // [아이디][담은 항목]
		int[][] cart = new int[ids.length][items.length];  // [[][담은 항목][담은 항목의 수량]]
		
		while(now) {
//			상태
			System.out.println("------------");
			if(state != -1) {
				System.out.println("상태 : " + ids[state]);  // 아이디
			}else {
				System.out.println("상태 : 로그아웃");
			}
			System.out.println("------------");
			
//			메뉴
			System.out.println("[Mart]\n[1]로그인\n[2]로그아웃\n[3]쇼핑\n[4]장바구니\n[0]종료\n메뉴 선택 >>");
			int menu = scan.nextInt();
			
//			로그인
			if(menu == 1) {
				System.out.println("아이디 : ");
				String inputId = scan.next();
				System.out.println("비밀번호 : ");
				String inputPw = scan.next();
				
				for(int i = 0; i < ids.length; i++) {
//					지금 이 경우엔 소용이 없지만 실제의 경우엔 isEmpty() 가 필요함!
//					isEmpty() 가 뭐냐하면 로그인/회원가입 할 경우 빈칸인채로 입력/완료되지 않게 하기위해
//					&& ids[i].isEmpty() != true && pws[i].isEmpty() != true
					if(inputId.equals(ids[i]) && inputPw.equals(pws[i])) {
						System.out.println(ids[i] + "님 환영합니다!");
						state = i;
						break;
					}else {
						System.out.println("아이디, 비밀번호를 확인해주세요.");
					}
				}
			}

//			로그인 후 이용 가능
			if(state != -1) {
				
//				로그아웃
				if(menu == 2) {
					System.out.println("로그아웃 되었습니다");
					state = -1;
//				쇼핑
				}else if(menu == 3) {
					boolean shopping = true;
					
					while(shopping) {
						System.out.println("[상품목록]");
						for(int i = 0; i < items.length; i++) {
							System.out.println("[" + (i+1) + "] " + items[i]);
						}
						System.out.println("[0] 뒤로가기");
						
//						if(jang[0] == null) {
//							System.out.println("[담은 항목]");
//						}
						
						System.out.println("장바구니에 담을 상품의 번호를 선택해주세요 >>");
//						장바구니에 담을 상품
						int addCart = scan.nextInt();
						
//						뒤로가기
						if(addCart == 0) {
							break;
						}
						
//						MAX_SIZE = 100 초과시 예외처리
						if(cartCnt == MAX_SIZE) {
							System.out.println("장바구니가 가득 찼습니다");
							break;
						}
						
//						0-> 1열, 0 => 2열 => (0,0)
//						여긴 아이디 인덱스 번호
						jang[cartCnt][0] = state;
//						여긴 상품 인덱스 번호
						jang[cartCnt][1] = addCart - 1;
//						여긴 담은 목록
						cart[state][addCart - 1]++;
						cartCnt++;
					}
					
//				장바구니
				}else if(menu == 4) {
					System.out.println("[장바구니]");
//					확인용
//					for(int i = 0; i < jang.length; i++) {
//						for(int j = 0; j < jang[i].length; j++) {
//							System.out.print(jang[i][j] + cart[i][j]);
//						}
//						System.out.println();
//					}
					for(int i = 0; i < cart.length; i++) {
						System.out.println(items[i] + " : " + cart[state][i] + "개");
					}
				}
				
//				로그인 후 이용 가능
			}else if(state == -1 && 1 <= menu && menu < 5) {
				System.out.println("로그인 후 이용해주세요");
				
//			종료
			}else if(menu == 0){
				System.out.println("종료되었습니다");
				now = false;
			}else {
				System.out.println("메뉴를 다시 확인해주세요");
			}
		}
	}

}
