package chapter07;

public class Quiz0702 {

	public static void main(String[] args) {
		// �� ���� ������ ���ڷ� ���� �޾Ƽ� ���� ���� ū ���� ��ȯ�ϴ� �Լ��� �����϶�
		illo(2, 3, 4);
		int big;
		big = illo(2, 3, 4);
		System.out.println("ū ���� : " + big);
		
		

	}
	
	public static int illo(int num1, int num2, int num3) {
		int add1 = (num1 > num2)? num1 : num2;
		int add2 = num3 > add1? num3 : add1;
		
		return add2;
		
	}

}
