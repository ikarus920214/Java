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
		// ���� ��� �ڽ� ����
		Box4 aBox = new Box4();
		Box4 oBox = new Box4();

		// ������ �ڽ��� ���� ���ϱ�?
		aBox.set("Apple");
		oBox.set("Orange");

		System.out.println(aBox.get()); // �����ص� ������ �ȶ��.
		System.out.println(oBox.get());	// ����ȯ�� ���� �ʰ� ���ڿ� �� ��ü�� ����Ѱ��̱� ����.
	}

}
