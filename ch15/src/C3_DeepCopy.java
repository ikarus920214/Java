class Point3 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point3(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle3 implements Cloneable {
	public Point3 upperLeft;	// ���� ��� ��ǥ
	public Point3 lowerRight;	// ���� �ϴ� ��ǥ
	
	public Rectangle3(int x1, int y1, int x2, int y2) {
		upperLeft = new Point3(x1, y1);
		lowerRight = new Point3(x2, y2);
	}
	
	// ��ǥ ������ ������
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Object Ŭ������ clone �޼ҵ� ȣ�� ����� ����
		Rectangle3 copy = (Rectangle3)super.clone();
		
		// ���� ������ ���·� ���纻�� ����
		copy.upperLeft = (Point3)upperLeft.clone();
		copy.lowerRight = (Point3)lowerRight.clone();
		
		// �ϼ��� ���纻�� ������ ��ȯ
		return copy;
	}
	
	// ���簢�� ��ǥ ���� ���
	public void showPosition() { 
		System.out.print("���� ���: ");
		upperLeft.showPosition();
		
		System.out.print("���� �ϴ�: ");
		lowerRight.showPosition();
		System.out.println();
	}
}
public class C3_DeepCopy {

	public static void main(String[] args) {
		Rectangle3 org = new Rectangle3(1, 1, 9, 9);
		Rectangle3 cpy;
		
		try {
			// �ν��Ͻ� ����
			cpy = (Rectangle3)org.clone();
			
			// �ν��Ͻ��� ��ǥ ������ ����
			org.changePos(2,  2,  7, 7);
			
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
