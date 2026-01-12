package arrayListTest;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
//		ArrayList<E> 참조변수 = new ArrayList<>();
//		<E> : 제네릭(Generic) -> 반드시 데이터 타입이 클래스로 작성되어야한다
//		ArrayList<>는 가변길이 클래스 배열이다
//		데이터가 삭제되거나 추가되면 자동으로 크기(배열의 길이)가 작아지거나 커진다
		
//		데이터 추가 메서드 - add(인뎃스번호, 값) 혹은 add(값)
//		add(인덱스번호, 값) 은 인덱스 번호 위치에 값이 추가. 이 경우 뒤의 모든 데이터가 뒤로 밀린다
//		add(값) 은 항상 맨 마지막 위치에 추가된다
		
//		데이터 삭제 메서드 - remove(인덱스번호)
//		삭제시 뒤의 데이터들은 앞으로 이동한다
		
//		데이터 추출 메서드 - get(인덱스번호)
		
//		배열의 길이 추출하는 메서드 - size()
		
//		요소가 비어있는지 확인하는 메서드 - isEmpty()
//		비어있으면 true, 아니면 false 를 반환한다
		
//		ArrayList<String> list = new ArrayList<>(); <- 이렇게 <> 비워둬도 됨
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
//		ArrayList<E> 의 <E> 부분에 데이터 타입이 클래스 이어야 하므로 
//		기본 데이터 타입인 int 를 사용할 수 없다.
//		그러므로 정수형 클래스 데이터 타입인 Integer 래퍼클래스를 입력한다.
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(20);
		num.add(30);
		
		list.add("사과");  // 데이터 추가
		list.add("바나나");
		list.add(1, "딸기");
		list.add(1, "포도");
//		lise2의 요소를 통째로 list로 추가하고 싶을 때 addAll() 메서드 사용 
		list2.add("시금치");
		list2.add("콩나물");
		
		list.addAll(list2);
		
		list.remove(0);  // 데이터 삭제
//		list.remove(4);
		
//		System.out.println(list.isEmpty());  // 존재 유무 확인
		
//		전체출력
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));  // 출력/반환
//			
//			if(list.isEmpty()) {  // 존재 유무 확인
//				System.out.println("공백");
//			}else {
//				System.out.println("삽입");
//			}
//		}
		
//		확장 for()문 이용해서 출력
//		for(자료형 변수이름 작명 : 참조변수){ 실행문 }  <- {} 없어도 됨
		for(String li : list) System.out.println(li);
		
		for(Integer n : num) System.out.println(n);
		
//		----------------------------------------------------------------------------
		
//		내가 만든 클래스를 ArrList<> 의 데이터 타입으로 사용
		ArrayList<Member> memInfo = new ArrayList<Member>();  // 객체화 한거임
		
		memInfo.add(new Member());
		memInfo.add(new Member("홍길동", "서울", 20));
		memInfo.add(new Member("이경령", "서울", 3));
		
		for(Member mem : memInfo) mem.printMember();
	}

}
