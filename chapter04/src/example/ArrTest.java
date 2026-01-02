package example;

import java.util.Arrays;

public class ArrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 선언 방법
//		1. int[] arr = new int[3];  // 정석
//		2. int arr[] = new int[3];
		
//		선언한 배열에 초기값 지정하는 방식
//		1. int[] arr01 = new int[]{1,2,3};
//		2. int arr01 = new[3]{1,2,3};  // 오류
//			┖> 이류 : 배열에 초기값 지정시 크기는 적지 않는다.
//		3. int[] arr01 = {1,2,3};
//		배열 선언시 int[] arr = new int[] -> 오류, 반드시 크기 입력
		
//		배열의 특징
//		1. 배열은 고정길이다
//		2. 배열은 자동으로 길이를 늘리고, 줄일 수 없다
//		3. 배열은 생성과 동시에 메모리를 한 번에 할당한다
//		4. 배열은 중간에 값을 비울 수 없다
//		5. 배열은 단순한 자력구조이므로 가변기능은 컬렉션이 담당한다
//			┖> 예) ArrList, LinkedList, Vector, Stack ... 등
		
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
//			정수형 배열의 초기값을 지정하지 않으면 기본값은 0
			System.out.println(arr[i]);
		}
		
		double[] doub = new double[3];
		for(int j = 0; j < doub.length; j++) {
//			실수형 배열의 초기값을 지정하지 않으면 기본값은 0.0 
			System.out.println(doub[j]);
		}
		
//		--------------------------------------------
		
		String[] str = new String[3];
		String[] str2 = null;
		String[] str3 = str;
		
//		배열의 길이 : 3
		System.out.println(str.length);
//		배열 요소값 : [null, null, null]
		System.out.println(Arrays.toString(str));
//		배열의 래퍼런스(주소) : [Ljava.lang.String;@2ff4acd0
		System.err.println(str);
		
//		객체 배열의 요소를 복사 : Arrays.copyOf(복사 할 대상, 복사 할 대상의 길이)
		str2 = Arrays.copyOf(str, str.length);
//		[Ljava.lang.String;@54bedef2
//		값만 복사 한거라서 주소는 다름!
		System.out.println(str2);
//		[Ljava.lang.String;@2ff4acd0
//		str을 str3에 넣은거(str = str3) 이라서 값과 주소가 같음!
		System.out.println(str3);
		
		for(int k = 0; k < str.length; k++) {
//			객체 배열의 초기값을 지정하지 않으면 기본값은 null
//			System.out.println(str[k]);
			
//			str 이 null 이면 '난 배열값' 으로 출력하고, 
//			null 이 아니면 본인 자기 자신값 출력
//			if(str[k].equals(null) {
//			String 객체는 비교할 때 equals() 사용해야하지만, 
//			문제는 null 이 객체가 아니므로 메서드 사용 못함
//			if(str[k] == null) {
//				System.out.println("난 배열값");
//			}else {
//				System.out.println(str[k]);
//			}
//			위의 if와 3항연산자가 같은거임
			String result = (str[k] == null ? "난 배열값" : str[k]);
			System.out.println(result);
		}
	}

}
