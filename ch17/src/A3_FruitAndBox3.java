class Apple3 {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange3 {
	public String toString() {
		return "I am an orange.";
	}
}

class Box3 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class A3_FruitAndBox3 {

	public static void main(String[] args) {
		// 과일 담는 박스 생성
		Box3 aBox = new Box3();
		Box3 oBox = new Box3();

		// 과일을 박스에 담은 것일까?
		aBox.set("Apple");	// <- 문자열을 담은것.
		oBox.set("Orange"); // 종이에 사과를 쓰고 담았다고 생각하기.

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple3 ap = (Apple3) aBox.get();
		Orange3 og = (Orange3) oBox.get();

		System.out.println(ap);		// 프린트라인을 지우고 실행하면 오류가 안뜬다.
		System.out.println(og);		// 실행하기 전까지 컴파일 과정에서 실수가 별견되지 않음.

	}

}
