package ifExample;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random class 는 int 정수형 난수를 발생하는 class 이다
//		숫자값을 입력하지 않으면 int 전체범위는 -2,147,483,648 ~2,147,483,647 를 난수로 발생시킨다
		Random ra = new Random();
		
//		1~10 까지의 난수를 발생시켜 출력
		int num = ra.nextInt(10) + 1;
		System.out.println("난수 : " + num);
	}

}
