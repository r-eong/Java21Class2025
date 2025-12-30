package ifExample;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
//		/ : 나누기 -> 지폐 매수, % : 나머지 -> 잔돈
		System.out.println("금액을 입력하시오 >> ");
		int money = 0;
		money = scan.nextInt();
		
		int num1 = money / 50000;  // 5만원권 매수
		int num11 = money % 50000;  // 잔돈
		
		int num2 = num11 / 10000;  // 5만원권 매수
		int num22 = num11 % 10000;  // 잔돈
		
		System.out.printf("오만원권 : %d 매 \n 일만원권 : %d 매 \n", num1, num2);
//		System.out.printf("오만원권 : %d 매 \n", money/50000);
//		System.out.printf("일만원권 : %d 매 \n", (money-50000)/10000);
//		System.out.printf("오천원권 : %d 매 \n", (money-60000)/5000);
//		System.out.printf("천원권 : %d 매 \n", (money-65000)/1000);
//		System.out.printf("오백원 : %d 매 \n", (money-66000)/500);
//		System.out.printf("백원 : %d 매 \n", (money-66500)/100);
	}

}
