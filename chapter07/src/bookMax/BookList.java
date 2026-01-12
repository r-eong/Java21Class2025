package bookMax;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
	ArrayList<BookDTO> list;
	
//	기본 생성자
	public BookList() {
		list = new ArrayList<BookDTO>();
	}
	
//	생성자 메서드
//	책 추가
	public void addBook(BookDTO b) {
		list.add(b);
	}
	
//	목록
	public void printList() {
		for(BookDTO b : list) {
			b.bookList();
		
		}
	}
	
//	최고가 책
	public void maxPrice() {
		int max = 0;
		int index = 0;
		
		DecimalFormat num = new DecimalFormat("#,##0원");
		
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i).getPrice()) {
				max = list.get(i).getPrice();
				index = i;
			}
		}
		System.out.println("제목 : " + list.get(index).getBookTitle() + "\t 저자 : " + list.get(index).getAuthor() + "\t 가격 : " + num.format(list.get(index).getPrice()));
	}
}
