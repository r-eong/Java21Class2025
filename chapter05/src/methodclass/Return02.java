package methodclass;

public class Return02 {
//	배열로 된 데이터 타입을 매개변수로 사용하는 함수 작성 연습
	
	public int test(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]% 4 == 0) {
				cnt++;
			}
		}
//		cnt = 4의 배수의 개수
		return cnt;
	}
	
	public static void main(String[] args) {
//		항상 객체화 먼저
		Return02 re = new Return02();
		
//		re.test() 매서드는 4의 배수의 개수를 반환함
//		고로 4의 배수에 해당하는 개수만 출력됨
		int [] arr02 = {10, 13, 14, 56, 70, 100};
		System.out.println(re.test(arr02));
//		위 아래 같은거임
//		int[] arr= {10,13,14,56,70,100};
//		System.out.println(re.test(arr));
	}
}
