import java.util.Random;

public class RandomUse {

	public static void main(String[] args) {
		
		// Type #1
		Random randomV1 = new Random();
		
		System.out.println(randomV1.nextBoolean()); // ������ ����
		System.out.println(randomV1.nextFloat());   // Float������ �� ����
		System.out.println(randomV1.nextInt());		// int �� ����
		System.out.println(randomV1.nextInt(100)); // range : 0 ~ 99 ���� ���� ����
		
		// Type #2 : 1~100 ������ �� ���
		double randomV2 = Math.random();
		System.out.println("1 : " + randomV2);
		int intVal = (int)(randomV2 * 100) + 1;
		System.out.println("2 : " + intVal);
		
		// (int)(Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�
                                   
	}

}
