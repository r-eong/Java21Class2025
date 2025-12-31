package ifExample;

import java.util.Random;

public class IfEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int num = ran.nextInt(50) + 1;
		System.out.printf("문제 [ %d ]\n", num);
		
		int one = num / 10; // 십의 자리
		int two = num % 10; // 일의 자리
		
		int cnt = 0;  // 짝 카운트
		
		if(one == 3 || one == 6 || one == 9) {
			cnt += 1;
		}
		if(two == 3 || two == 6 || two == 9){
			cnt += 1;
		}
		
		if(cnt == 1) {
			System.out.println("짝");
		}else if(cnt == 2) {
			System.out.println("짝짝");
		}else {
			System.out.println(num);
		}
		
	}

}
