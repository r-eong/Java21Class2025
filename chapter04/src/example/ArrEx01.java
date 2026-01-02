package example;

public class ArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1) 10부터 50까지 arr배열에 저장
//		정답1) 10 20 30 40 50
		int[] num = new int[]{10, 20, 30, 40, 50};
		System.out.println("문제1");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
//		문제2) 4의 배수만 출력
//		정답2) 20 40
		System.out.println("문제2");
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 4 == 0) {
				System.out.println(num[i]);
			}
		}
		
//		문제3) 4의 배수의 합 출력
//		정답3) 60
		System.out.println("문제3");
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 4 == 0) {
				sum += num[i];
			}
			System.out.println(sum);
		}
		
//		문제4) 4의 배수의 개수 출력
//		정답4) 2
		System.out.println("문제4");
		int cnt = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 4 == 0) {
				cnt ++;
			}
			System.out.println(cnt);
		}
		
//		문제5) 짝수의 개수 출력
//		정답5)
		System.out.println("문제5");
		int cnt2 = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.println(num[i]);
				cnt2++;
			}
		}
	}

}
