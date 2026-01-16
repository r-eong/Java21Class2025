package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
//		Map<key, Value>
//		자바의 collection 의 프레임워크 일종
//		특징 : 반드시 key(키), value(값) 의 쌍으로,
//		key(키)는 중복을 허용하지 않는다.
//		valus(값) 은 중복을 허용한다.
//		Map 은 key(키)를 이용하여 value(값)을 저장하거나 검색, 삭제할 때 사용하면 유용
		
//		Map 의 종류 : HashMap, HashTable, TreeMap, Properties... 등
		
//		Map 인터페이스 메소드
//		put[키, 값] : 키와 값을 입력하는 메소드
		
//		Map은 반드시 import 해야한다.
//		< 꺽쇠 > 는 제네릭이라고 한다.
		
//		Map<K, V>
//		K 는 반드시 래퍼클래스(String, Intger, Double ...) 또는 개발한 Class
//		ex) Member, Product, Cart ... 등 내가 만든 Class 사용 가능
//		HashMap 은 Map 의 하위클래스이므로 데이터 타입을 부모인 Map 으로 업캐스팅 할 수 있다.
		Map<String, String> list = new HashMap<String, String>();
//		생성한 객체의 list 를 부르는 말 : 참조변수
		
		HashMap<String, String> list2 = new HashMap<String, String>();
		
//		Map 은 인터페이스이므로 객체를 생성할 수 없다.
//		고로, 아래 객체 생성은 오류다.
//		Map<String, String> list3 = new Map<String, String>;
		
		String[] key = {"a", "z", "b", "c", "d", "e"};
		String[] value = {"apple", "zone", "banana", "candy", "dog", "enum"};
		
//		list 참조변수에 put() 메소드 사용 가능한 이유 
//		: HashMap 객체 생성하고 데이터 타입은 Map이라서.
//		  Map 인터페이스의 메소드에 모두 접근할 수 있다.
		for(int i = 0; i < key.length; i++) {
			list.put(key[i], value[i]);
//			{a : apple, b : banana ... 이런식임! 
//			┖> 근데 이 형식으로 저장되는건 아님!! key, value 역할을 보여주는거임!!
		}
		
//		출력
		System.out.println(list);
//		┖> {a=apple, b=banana, c=candy, d=dog, e=enum}
//		HashMap은 순서가 보장되지 않는다. 입력 순서도 없고, 저장도 순서가 없다.
//		HashMap 은 해시테이블에 저장되고, 비성형자료구조이다.
		
		System.out.println("---------------");
		
//		Keyset() : 키값 출력, Value() : values 값 출력 메소드 사용 방법
		System.out.println(list.keySet());
//		┖> [a, b, c, d, e]
		System.out.println(list.values());
//		┖> [apple, banana, candy, dog, enum]
		
		System.out.println("---------------");
		
//		get(현재 출력하고싶은 key값을 입력) 메소드
		System.out.println(list.get("c"));
//		┖> candy
//		key 값이 c 에 해당하는 value 값이 candy 가 출력됨.
		System.out.println(list.get("apple"));
//		┖> null
		System.out.println(list.get(key));
//		┖> null
		
//		replace()
//		key 값과 바꿀 값을 제공하면 해당 키의 value 가 변경됨.
		list.replace("c", "cat");
		System.out.println(list.get("c"));
//		┖> cat
		
//		put() : 이미 존재하는 같은 key 에 해당하는 value 를 새로운 값으로 덮어씀
		list.put("c", "coin");
		System.out.println(list.get("c"));
//		┖> coin
		
//		추가
		list.put("f", "float");
		System.out.println(list);
//		┖> {a=apple, b=banana, c=coin, d=dog, e=enum, f=float, z=zone}
		
//		contsindKey(), contsinsValue()
//		Key 나 Value 의 존재유무. true/false 로 반환됨.
		
		boolean isCheck;
		boolean isCheckValue;
		
		isCheck = list.containsKey("x");
		System.out.println(isCheck);
//		┖> false
		
		isCheckValue = list.containsValue("apple");
		System.out.println(isCheckValue);
//		┖> true
		
//		remove(), clear()
//		remove(제공한 key) : 제공한 키 값의 항목만 삭제
//		clear() : 전체 삭제
		list.remove("c");
		System.out.println(list);
//		┖> {a=apple, b=banana, d=dog, e=enum, f=float, z=zone}
		
		list.clear();
		System.out.println(list);
//		┖> {}
		
		
		for(int i = 0; i < key.length; i++) {
			list.put(key[i], value[i]);
		}
		
		System.out.println("------- 확장 for()문으로 출력 -------");
//		for(데이터타입 변수이름지정 : 참조변수)
//		key = [a, b, c, d, e, z]
		for(String m : list.keySet()) {
			System.out.println(m + " : " + list.get(m));
		}
//		┖> a : apple
//		   b : banana
//		   c : candy
//	   	   d : dog
//		   e : enum
//		   z : zone
		
//		Iterator()
		System.out.println("------- Iterator() 메소드 -------");
//		collection 또는 Map 에서 사용하는 객체 순회 메소드
//		keyset = [a, b, c, d, e, z]
//		Set<데이터타입> 변수이름지정 = 참조변수.keySet();
		Set<String> keyset = list.keySet();
		Iterator<String> ir = keyset.iterator();
//		┖> keyset 을 iterator 방식으로 ir 에 담아! 라는 뜻!
		
//		ir = [a, b, c, d, e, z]
		while(ir.hasNext()) {  // .hasNext() : 다음의 key 가 존재하면 true
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k + " : " + v);
		}
//		┖> a : apple
//		   b : banana
//		   c : candy
//	   	   d : dog
//		   e : enum
//		   z : zone
//		결국은 확장 for()문이랑 결과가 같음!!
	}

}
