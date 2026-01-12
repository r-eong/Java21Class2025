package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleEx {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		SimpleDataFormat 클래스는 날짜를 특정 형식의 
//		문자열로 출력하거나 문자열로 변환할 때 사용
//		출력할 때 : SimpleDAteFormat.format()
//		변경할 때 : SimpleDAteFormat.parse()
//		SimpleDAteFormat 클래스도 new 예약어로 객체 생성한다
//		SimpleDAteFormat.format("yyyy-mm-dd")
//		┖> 따옴표 안에 변경할 날짜 형식 입력
		
		Scanner scan = new Scanner(System.in);
		
//		현재 날짜/시간 객체
//		타입이 Date 인 now 객체를 생성함
		Date now = new Date();
		
//		날짜 포맷
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일(E)");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss a");
//		mm 은 시간의 mm으로 인식해서 MM 으로 써야함!!
//		yy 는 꼭 소문자로 써야됨!!
		
		System.out.println(sdf1.format(now));
		System.out.println(now);
//		┖> Mon Jan 12 10:42:02 KST 2026 -> 주소가 출력되지 않음!
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
		
		System.out.println(sdf1.parse("2026-02-03"));  // 날짜를 문자형식으로 입력받음
		System.out.println(sdf3.format(sdf1.parse("2026-02-03")));
	}

}
