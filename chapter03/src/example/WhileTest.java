package example;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(조건)문은 괄호 안의 조건을 만족(true)할 때 까지 loop(루프 = 반복)를 돌린다
//		조건이 false 가 되면 loop를 빠져나온다
		
		int num = 1;  // 조건을 만족하기 위한 +1 누적 변수
		int sum = 0;  // 총 합계를 담기 위한 변수
		
////		1 ~ 10 까지의 값을 더한 값을 출력
//		while(num <= 10) {
//			sum += num;
////			num 값을 누적하지 않으면 무한루프 발생
//			num ++;  // num = num + 1 -> num = 2
//			System.out.printf("sum : %d, num : %d\n", sum, num);
//		}
		
//		while(true) {
//			sum += num;
//			num++;
//			break;  // loop 빠져나옴
//		}
//		System.out.println(sum);
//		System.out.println(num);
		
//		-------------------------------------------------
		
//		문제 1) 10 ~ 1 까지 반복해서 6 ~ 3 까지 거꾸로 출력
//		정답 : 6, 5, 4, 3
		int ans1 = 10;
		
		while(0 < ans1) {
			if(ans1 <= 6 && ans1 >= 3) {
				System.out.print(ans1 + ", ");
			}
			ans1 --;
		}

	}

}
