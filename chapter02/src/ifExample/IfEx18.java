package ifExample;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이용할 정거장 수를 입력하세요 >> ");
		int stop = scan.nextInt();
		
		int fee = 0;  // 금액
		
		if(0 < stop && stop <= 5) {
			fee = 500;
		}else if(5 < stop && stop <= 10) {			
			fee = 600;
		}else {
			if(stop % 2 == 1) {
				fee = 600;
//				ex) (13 - 10) / 2 = 1
				int count = (stop - 10) / 2 * 50;
				fee = fee + count + 50;
//				int count = (stop - 9) / 2 * 50;  // 9라고 쓰면 한줄로 줄일 수 있지만 헷갈림
			}else if(stop % 2 == 0) {
				fee = 600;
				int count = (stop - 10) / 2 * 50;
				fee = fee + count;
			}
		}
		System.out.println("요금 : " + fee + "원");
	}

}
