package bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
//	DTO : Data Transfer Object. 데이터 전송 객체를 의미!
//	DB의 데이터를 임시로 저장하는 공간으로 만들어놓은 클래스
	
//	멤버변수  ★필수
	String Booktitle;  // 도서명
	String Author;  // 저자
	String publisher;  // 출판사
	Date Date;  // 출판일
	int Price;  // 가격
	
//	출력 날짜 형식
//	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E)");
//	책별 금액 형식
	DecimalFormat num1 = new DecimalFormat("#,###원");
	
//	기본 생성자
	public BookDTO() {};
	
//	매개변수 생성자
	public BookDTO(String Booktitle, String Author, String publisher, Date Date, int Price) {
//		this 는 BookDTO class 를 의미
		this.Booktitle = Booktitle;
		this.Author = Author;
		this.publisher = publisher;
		this.Date = Date;
		this.Price = Price;
	}
	
//	출력 메서드
	public void printBook() {
//		DecimalFormat 을 이용해서 숫자의 형식을 변경하여 출력하면 문자가 됨을 주의 ★
//		SimpleDateFormat 을 이용해서 변경한 날짜는 문자이다 -> %s 로 써야한다는 뜻
		System.out.println(Booktitle + "\t" + Author + "\t" + publisher + "\t" + sdf2.format(Date) + "\t" + num1.format(Price));
	}
}
