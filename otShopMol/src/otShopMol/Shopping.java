package otShopMol;

import java.util.*;

public class Shopping extends UserMenu {
	Scanner scan = new Scanner(System.in);
//	쇼핑 메뉴 메소드
	
//	객체화
	ItemManager it = new ItemManager();

	String menu = "[1]로그인\n[2]로그아웃\n[3]쇼핑\n[0]종료\n";
	String mageMenu = "[1]로그아웃\n[2]아이템관리\n[3]장바구니 리스트\n";
	String itemMenu = "[1]아이템 추가\n[2]아이템 수정\n[3]아이템 삭제\n[0]종료\n";
	
	public void menu() {
		while(true) {
			System.out.println();
			System.out.print(menu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				login();
				if(log == 0) {
					managerMenu();
				}
			}else if(select  == 2) {
				logout();
			}else if(select == 3) {
//				쇼핑은 반드시 로그인 상태여야 한다
				if(log < 0) {  //  log = -1 = 로그아웃 상태
					System.out.println("로그인 후 이용 가능");
				}else {  // log > 0 = 로그인 상태
					shopMenu();
				}
			}else if(select == 0) {
				System.out.println("쇼핑몰 종료");
				break;
			}else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}
	
	
//	쇼핑 메서드
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기\n");
			int select = scan.nextInt();
			
			if(select == 0) {  // 뒤로가기
				break;
			}else if(select == 1) {
				it.printCategory();
				System.out.println("쇼핑목록 선택 [뒤로가기 -1]");
				int ctId = scan.nextInt();
				
				int n = 0;
				for(int i = 0; i < it.itemList.size(); i++) {
//					카테고리 인덱스에 해당하는 상품이 존재하는지 비교
//					존재하지 않는 상품 선택불가 예외처리
					if(it.category.get(ctId).equals(it.itemList.get(i).category)) {
						System.out.print("[" + i + "]");
						it.itemList.get(i).printInfo();
					}
				}
				
				System.out.print("상품 선택 >> ");
				int itemId = scan.nextInt();
				
//				항목 추가 : 장바구니 카트에 내가 산 항목 추가
				it.addCart(super.id[log], ctId, itemId);
				
			}else if(select == 2) {
				System.out.println("===== 장바구니 =====");
				for(int i = 0; i < it.jangList.size(); i ++) {
//					로그인 한 id 랑 장바구니 id 와 같은지 <- 굳이 안해도 되긴 함!
//					현재 jangList 에 물건을 산 유저의 id별로 담겨있다.
//					예) [aaa] ~
					if(it.jangList.get(i).userId.equals(id[log])) {
						it.jangList.get(i).printCart();
					}
				}
				System.out.println("================");
			}
		}
	}
	
//	관리자 메뉴
	public void managerMenu() {
		while(true) {
			System.out.println();
			System.out.print(mageMenu);
			System.out.print("메뉴 선택 >> ");
			int select = scan.nextInt();
			
			if(select == 1) {  // 로그아웃
				logout();
				break;
				
			}else if(select == 2){  // 아이템 관리
				itemManager();
				
			}else if(select == 3) {  // 장바구니 리스트
				System.out.println("===== 장바구니 리스트 =====");
				it.printCartList();
				System.out.println("======================");
				
			}else {
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
//	로그인 메소드
	public void login() {
		if(log > -1) {
			System.out.println("로그인중입니다.");
		}else {
			log = super.userLogin();
		}
	}
	
//	로그인 메소드
	public void logout() {
		if(log < 0) {
			System.out.println("로그아웃 상태입니다.");
		}else {
			log = -1;
			System.out.println("안녕히 가세요.");
		}
	}
	
//	아이템 관리 메소드
	public void itemManager() {
		while(true) {
			System.out.println();
			System.out.print(itemMenu);
			System.out.println("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {  // 아이템 추가
				System.out.println("추가 할 상품 이름을 입력하세요");
				String addName = scan.next();
				
				System.out.println("추가 할 상품 금액을 입력하세요");
				int addPrice = scan.nextInt();
				
				System.out.println("추가 할 상품의 카티고리를 입력하세요");
				it.printCategory();
				int addCate = scan.nextInt();
				
//				아이템 추가 메소드
				it.addItem02(addName, addPrice, addCate);
				
//				목록 출력
				it.printItemList();
				
			}else if(select == 2) {  // 아이템 수정
				it.printItemList();
				System.out.println("수정할 상품 번호를 입혁하세요.");
				int upIndex = scan.nextInt();
				
				System.out.println("수정할 상품 이름을 입력하세요.");
				String upName = scan.next();
				
				System.out.println("수정할 상품의 금액을 입혁하세요.");
				int upPrice = scan.nextInt();
				
//				아이템 수정 메소드
				it.updateItem(upIndex, upName, upPrice);
				
				it.printItemList();
				
			}else if(select == 3) {  // 아이템 삭제
				it.printItemList();
				System.out.println("삭제할 상품 번호를 입력하세요.");
				int delIndex = scan.nextInt();
				
//				아이템 삭제 메소드
				it.delItem(delIndex);
				
				it.printItemList();
				
			}else if(select == 0) {
				 System.out.println("아이템 관리 종료");
				 break;
			}else {
				System.out.println("없는 메뉴 입니다.");
			}
		}
	}
}
