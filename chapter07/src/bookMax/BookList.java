package bookMax;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
	DecimalFormat num = new DecimalFormat("#,##0원");
	
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
		
		
		
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i).getPrice()) {
				max = list.get(i).getPrice();
				index = i;
			}
		}
		System.out.println("제목 : " + list.get(index).getBookTitle() + "\t 저자 : " + list.get(index).getAuthor() + "\t 가격 : " + num.format(list.get(index).getPrice()));
	}
	
//	확장 for문 ver.
	public void maxPrice2() {
		int max = 0;
		String maxtitle = null;
		
		for(BookDTO b : list) {
//			현재 b 에 저장된 값 : list.get(0) = {booktitle, author, price} 
			if(max < b.getPrice()) {
				max = b.getPrice();
				maxtitle = b.getBookTitle();
			}
		}
		System.out.println("제목 : " + maxtitle + "\t가격 : " + num.format(max));
	}
}
