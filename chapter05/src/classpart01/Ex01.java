package classpart01;

public class Ex01 {
//	클래스는 데이터, 기능만 작성
//	메인 메소드는 출력을 담장
	
//	멤버변수는 배열도 가능
	int[] arr = {87, 100, 11, 72, 92};
	
	public static void main(String[] args) {
//		문제1) 전체 합 출력
		Ex01 e = new Ex01();
		
		int total = 0;
		for(int i = 0; i < e.arr.length; i++) {
			total += e.arr[i];
		}
		
		System.out.println(total);
	}
}
