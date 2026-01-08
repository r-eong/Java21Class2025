package classpart06;

import java.util.*;

public class ClassEx06 {
//	멤버변수
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555", "", "", "", "", ""};
	String[] arPw = {"1234", "2345", "3456", "4567", "5678", "", "", "", "", ""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500, 0, 0, 0, 0, 0};
	
	int count = 5;
	
//	로그인 상태
	int loginCheck = -1;
	
	Scanner scan = new Scanner(System.in);

//	-------------------------------------------------------------------------------
	
//	생성자
	
//	계좌, 비밀번호, 잔액 출력 -> main으로!
//	public void print() {
//		System.out.println("----------------------");
//		System.out.println("계좌번호\t비밀번호\t계좌잔액");
//		System.out.println("----------------------");
//		for(int i = 0; i < arAcc.length; i++) {
//			if(arAcc[i] != "") {
//				System.out.println(arAcc[i] + "\t" + arPw[i] + "\t" + arMoney[i]);
//			}
//		}
//		System.out.println("----------------------");
//		System.out.println();
//	}
	
//	메뉴
	public void menu() {
		System.out.println("[Bank]");
		if(loginCheck == -1) {
			System.out.println("상태 : 로그아웃");
		}else {
			System.out.println("상태 : " + arAcc[loginCheck] + "님 로그인 중");
		}
	}
	
//	1. 회원가입
	public void join() {
		System.out.println("계좌번호 : ");
		String addAcc = scan.next();
		System.out.println("비밀번호 : ");
		String addPw = scan.next();
		System.out.println("넣을 금액 : ");
		int addMoney = scan.nextInt();
		
//		for(int i = 0; i < arAcc.length; i++) {
//			if(arAcc[i] == "") {
//				arAcc[i] += addAcc;
//				arPw[i] += addPw;
//				arMoney[i] += addMoney;
//				arMoney[i] += 1000;
//				break;  // 한 번만 추가 되어야 하니까 
//			}
//		}
		arAcc[count+1] += addAcc;
		arPw[count+1] += addPw;
		arMoney[count+1] += addMoney;
		arMoney[count+1] += 1000;
		count++;
	}
	
////	회원가입 다른 방법 - void 를 안 쓰려고 굳이굳이 만든 방법임!
////	acc : 계좌번호 / pw : 비밀번호 / money : 입금(보유)금액
//	public boolean join(String acc, String pw, int money) {
////		계좌 중복체크
//		for(int i = 0; i < arAcc.length; i++) {
//			if(arAcc[i].equals(acc)) return false;
//		}
//		
//		arAcc[count] = acc;
//		arPw[count] = pw;
//		arMoney[count] = money + 1000;
//		count++;
//		
//		return true;
//	}
//	┖> 이렇게 쓰면 main에서 3항 연산자 사용가능
//	System.out.println(ce06.join(acc, pw, money) ? "가입성공" : "중복된 계좌입니다");
	
//	2. 로그인
	public void login() {
		System.out.println("계좌번호 : ");
		String inputAcc = scan.next();
		System.out.println("비밀번호 : ");
		String inputPw = scan.next();
		
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i].equals(inputAcc) && arPw[i].equals(inputPw)) {
				System.out.println("로그인 성공");
				System.out.println(arAcc[i] + "님, 어서오세요!");
				loginCheck = i;
				continue;
			}
		}
		System.out.println("계좌번호, 비밀번호를 확인하세요.");
	}
	
//	3. 로그아웃
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
		loginCheck = -1;
	}
	
//	4. 입금
	public void addMoney() {
		System.out.println("입금할 금액 : ");
		int addMo = scan.nextInt();
		arMoney[loginCheck] += addMo;
	}
	
//	5. 이체
	public void sandMoney() {
		int check = -1;  // 계좌 유무 확인 예외처리
		
		System.out.println("이체할 계좌 : ");
		String sandAcc = scan.next();  // 보낼 계좌

		System.out.println("이체할 금액 : ");
		int sandMo = scan.nextInt();  // 보낼 금액
		
		arMoney[loginCheck] -= sandMo;  // 내 계좌에서 빼기
		
		for(int i = 0; i < arAcc.length; i++) {
			if(arAcc[i].equals(sandAcc)) {
				arMoney[i] += sandMo;  // sandMo 계좌에 추가
				check = i;
			}
		}
		
//		예외처리
		if(check == -1 || arMoney[loginCheck] < sandMo) {
			System.out.println("없는 계좌번호이거나 잔액이 부족합니다");
		}
	}
	
//	6. 잔액조회
	public void checkMoney() {
		System.out.println("잔액 : " + arMoney[loginCheck] + "원");
	}
}
