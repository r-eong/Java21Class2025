package polymorphism;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
//		현재 moveAnimal 메서드는 매개변수로 Animal 을 데티어 타입으로 가진다
		at.moveAnimal(new Human());
		at.moveAnimal(new Tiger());
		at.moveAnimal(new Eagle());
	}
	
//	데이터 타입이 Animal 인 메서드
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
