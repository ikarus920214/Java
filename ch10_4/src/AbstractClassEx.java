// 추상 클래스의 이해와 사용
// 추상 클래스를 상속하는 클래스는 추상메서드를 반드시 오버라이딩해서 구현
abstract class Animal {
	int age;

	abstract void cry();

}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();

		Cat cat = new Cat();
		cat.cry();

	}

}
