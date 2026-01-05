package multiexample;

public class CompareTO_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CompareTo() 메서드는 String pool 과 전혀 상관없이 묹열의 내용만을 비교함
//		A.compareTo(B)
//		┖> 결과 : 0, 음수, 양수 -> 가 출력됨
//		A 와 B 가 같으면 0이 출력됨
//		A 가 B보다 사전적 순서가 앞이면 음수 출력
//		A 가 B보다 사전적 순서가 뒤면 양수 출력
		
//		문자만 해당됨!! 만약 숫자를 넣어도 문자화됨 당연함 String임!!
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
//		유니코드로 가 = 44032, 나 = 45208
		int result1 = str1.compareTo(str2);
		System.out.println(result1);  // -1176
		
		int result2 = str2.compareTo(str1);
		System.out.println(result2);  // 1176
		
		int result3 = str1.compareTo(str3);
		System.out.println(result3);  // 0
		
		if(result3 != 0) {
			System.out.println("같은 문자가 존재하지 않습니다");
		}else {
			System.out.println("같은 문자입니다");
		}
	}

}
