class Point1 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point1(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class C1_InstanceCloning {

	public static void main(String[] args) {
		Point1 org = new Point1(3, 5);
		Point1 cpy;

		try {
			cpy = (Point1) org.clone();
			org.showPosition();
			cpy.showPosition();

			if (org.equals(cpy))	// equals를 구현하지 않았기 때문에 false; 비교시 다르다고 나옴
				System.out.println("aaaaa.");
			else
				System.out.println("bbbbb.");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
