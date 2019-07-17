class Apple4 {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange4 {
	public String toString() {
		return "I am an orange.";
	}
}

class Box4 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class A4_FruitAndBox4 {

	public static void main(String[] args) {
		// 과일 담는 박스 생성
		Box4 aBox = new Box4();
		Box4 oBox = new Box4();

		// 과일을 박스에 담은 것일까?
		aBox.set("Apple");
		oBox.set("Orange");

		System.out.println(aBox.get()); // 실행해도 오류가 안뜬다.
		System.out.println(oBox.get());	// 형변환을 하지 않고 문자열 그 자체를 출력한것이기 때문.
	}

}
