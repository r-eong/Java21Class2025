package methodclass;

import java.util.Scanner;

public class Return03 {
//	멤버변수
	
	int num1 = 10;
	int num2 = 20;
	
	public void test02() {
		if(num1 >= num2) {
			System.out.println("크다");
		}
//		반환하지 않는 함수에 return 사용하면 즉시 메서드 종료
		return;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		객체화
		Return03 re3 = new Return03();
		
//		while() 문을 이용하여 출력
		while(true) {
			System.out.println("메뉴 출력");
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
//				반환하지 않고 즉시 함수종료
				re3.test02();
			}else {
				System.out.println("종료");
				return;  // while() 문 종료
			}
		}
	}
}
