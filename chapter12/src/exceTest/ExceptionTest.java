package exceTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Exception 및 하위클래스를 이용해서 예외처리를 다양하게 할 수 있다.
		
		int i = 0;
		int j = 0;
		
		int[] iarr = new int[5];  // 선형 자료구조 : 자료를 나열하면서 저장
		
//		ArrayList 는 List 의 하위 클래스이므로 업캐스팅 할 수 있다.
		List<Integer> list = new ArrayList<Integer>();  // 선형 자료구조
		
//		try{}catch(){}catch(){}...finally(){}
		try {  // 실행 구문
			System.out.println("input i : ");
			i = scan.nextInt();
			System.out.println("input j : ");
			j = scan.nextInt();
			System.out.println("i / j = " + (i / j));
			
			for(int k = 0; k < 6; k++) {
				System.out.println("iarr[" + k + "]" + iarr[k]);
			}
			
			System.out.println("List Size : " + list.size());
		}catch(InputMismatchException e) {  //실행구문에 오류가 있을 때 catch 로 넘김
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
//			┖> java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			System.out.println(e.getMessage());
//			┖> Index 5 out of bounds for length 5
			System.out.println("배열 길이 오류");
		}catch(Exception e) {
//			Exception 은 최상위 클래스로 catch 가 여러개 일 때
//			첫 구문에 적지 않도록 한다.
//			이유 : 최상위 클래스여서 다른 catch 를 사용할 수 없게 됨!!
			
//			e.printStackTrace();  // 빨간 오류문구 
			System.out.println("숫자를 입력하세요");
		}finally {  // 오류의 존재 유무와 상관없이 무조건 출력
			System.out.println("end");
		}
	}

}
