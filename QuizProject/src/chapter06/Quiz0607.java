//���� 06-07 
//1�̻� 100�̸��� �����߿��� 7�ǹ���� 9�ǹ���� ����ϴ� ���α׷��� �ۼ��϶�.
//��, 7�� ����̸鼭 ���ÿ� 9�� ����� ������ �ѹ��� ����ؾ� �Ѵ�.


package chapter06;

public class Quiz0607 
{

	public static void main(String[] args)
	{
		int num = 1;
		int num1 = 0;
		int num2 = 0;
		
		
		while((num1++) < 100) {
			if((num1 % 7) != 0)
					continue;
			
			num2++;
			System.out.print(num1 + " ");
		}
System.out.print('\n');

		int num3 = 0;
		int num4 = 0;
		
		while((num3++) < 100) {
			if((num3 % 9) != 0)
				continue;
			
			num4++;
			System.out.print(num3 + " ");
			
		}
		System.out.print('\n');
	



		
		while(true) {
			if(((num % 7) == 0) && ((num % 9) == 0))
				break;
			
			num++;

		}
		System.out.println(num);

	}

}
