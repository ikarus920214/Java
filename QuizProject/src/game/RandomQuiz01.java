package game;
import java.util.Random;

public class RandomQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���δٸ� 3�ڸ��� �������� �����
//		QuizRandom
//
//		������ ���ڸ� ���� ǥ���մϴ�.
//		�� 100�� �ڸ��� ���� 10�� �ڸ��� �� 1�� �ڸ��� ���� ���Ƽ��� �ȵ˴ϴ�.
//
//		Ex ) 
//		101 �� �ȵ� : 1�� �ΰ���
//		777 �� �ȵ� : 7�� ������
//
//		224 �� �ȵ� : 2�� �ΰ���
//		233 �� �ȵ� : 3�� �ΰ���

		Random randomV1 = new Random();
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		while(true) {
			num1 = randomV1.nextInt(9)+1;
			num2 = randomV1.nextInt(10);
			num3 = randomV1.nextInt(10);
			if(num1 == num2 || num1 == num3 || num2 == num3) {
				continue;
				
			}else {
				break;
			}
		}

	
	int Sum = num1*100 + num2*10 + num3;
	
	System.out.print(Sum);

	}

}