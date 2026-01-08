package classpart09;

import java.util.*;

public class ClassEx09 {
	int[] x = new int[5];
	
//	랜덤 배열 함수
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[ ");
		
		for(int i = 0; i < x.length; i++) {
			x[i] = ran.nextInt(100) + 1;
			System.out.print(x[i] + " ");
		}
		System.out.println("]");
	}
	
//	총 합
	public int total(int[] x) {
		int totalres = 0;
		
		for(int i = 0; i < x.length; i++) {
			totalres += x[i];
		}
		
		return totalres;
	}
	
//	평균
	public double avg(int[] x) {
//		아래 대신 이렇게 사용해도 됨 그럼 아래 for() 안써도 됨
		int totalres02 = total(x);
//		float totalres02 = 0;
//		
//		for(int i = 0; i < x.length; i++) {
//			totalres02 += x[i];
//		}
		
		double avgres = totalres02 / x.length;

		return avgres;
	}
	
//	1등
	public int max(int[] x) {
		int maxres = 0;
		
		for(int i = 0; i < x.length; i++) {
			if(maxres < x[i]) {
				maxres = x[i];
			}
		}

		return maxres;
	}
	
//	꼴등
	public int min(int[] x) {
//		최소값은 초기값을 0 으로 지정하면 안됨. 당연함 그럼 0나옴!
		int minres = x[0];
		
		for(int i = 0; i < x.length; i++) {
			if(minres > x[i]) {
				minres = x[i];
			}
		}

		return minres;
	}
}
