package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
//		객체화
		BookList bL = new BookList();
		
//		입력 날짜 형식
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//		총 금액 형식
		DecimalFormat num2 = new DecimalFormat("\u00A4#,###원");
		
//		책
		bL.addBook(new BookDTO("java", "홍길동", "코리아", sdf1.parse("2026-01-12"), 35000));
		bL.addBook(new BookDTO("react", "김철수", "코리아", sdf1.parse("2025-02-12"), 45000));
		bL.addBook(new BookDTO("spring", "이영희", "코리아", sdf1.parse("2020-03-12"), 15000));
		bL.addBook(new BookDTO("html", "개나리", "코리아", sdf1.parse("2023-01-12"), 75000));
		bL.addBook(new BookDTO("mysql", "진달래", "코리아", sdf1.parse("2021-04-12"), 25000));
		
		System.out.println("================================================");
		System.out.println("도서명\t저자\t출판사\t출판일\t\t가격");
		System.out.println("================================================");
		bL.bookList();
		System.out.println("================================================");
		System.out.println("합계 : " + num2.format(bL.totalPrice()));
	}
}
