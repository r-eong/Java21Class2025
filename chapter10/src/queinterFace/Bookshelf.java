package queinterFace;

//Shelf 가 Queue 를 implements 
//BookShelf 가 shelf Extends 받기
//실무에서 많이 사용하는 방식
public class Bookshelf extends Shelf implements Queue {

	@Override
	public void inQueue(String title) {
		shelf.add(title);  // 맨뒤로 넣기 (= 추가)
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);  // 제일 첫 번째(= 0) 자료 삭제 / 꺼내기 (= 삭제)
//		ArrayList<> 는 삭제되고나면 뒤의 데이터가 앞으로 이동 
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
