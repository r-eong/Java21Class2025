package ifExample;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String 은 객체 데이터 타입으로 dbid = "1234" 값이 저장된 힙메모리의 주소가 
//		dbid에 존재하기 때문에 값을 직접 비교할 수 없다
//		이런 경우, 문자를 비교할 때는 반드시 equals() 메서드를 이용해서 힙메모리의 값을 직접 비교해야한다
//		int 기본 데이터 타입은 변수에 값이 저장되어있으므로 ==(같다)만 가지고 값을 비교할 수 있다
		
		String dbid = "1234";
		String dbpw = "1111";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("아이디 입력 : \n");
		String id = scan.next();
		System.out.printf("비밀번호 입력 : \n");
		String pw = scan.next();
		
//		if(!dbid.equals(id) && !dbpw.equals(pw)) {  // 부정형
		if(dbid.equals(id) && dbpw.equals(pw)) {
			System.out.printf("로그인 성공");
		}else {
			System.out.printf("로그인 실패");
		}
	}

}
