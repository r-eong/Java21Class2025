package bookshop;

import java.util.ArrayList;
import java.util.Date;

public class BookList {
//	BookDTO 멤버변수 받아와서 배열
//	ArrayList<BookDTO> list = new ArrayList<BookDTO>();
//	┖> list[0] = {Booktitle : ~, Author : ~, publisher : ~, Date : ~, Price : ~},
//	┖> list[1] = {Booktitle : ~, Author : ~, publisher : ~, Date : ~, Price : ~}, ...
//	가변길이라서 BookDTO[] list = new BookDTO[100] 보다 효율적이고 편함!
	ArrayList<BookDTO> list; 
	
	public BookList() {
		list = new ArrayList<BookDTO>();  // 이렇게 나눠서 써도 됨!
	}
//	생성자 메서드
//	책
	public void addBook(BookDTO b) {
//		b.Booktitle 로 접근가능
		list.add(b);
	}
	
//	목록
	public void bookList() {
		for(BookDTO b : list) {
			b.printBook();
		}
	}
	
//	합계
	public int totalPrice() {
		int total = 0;
		for(BookDTO b : list) {
			total += b.Price;
		}
		
		return total;
	}
}
