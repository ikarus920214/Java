//문제 06-07 
//1이상 100미만의 정수중에서 7의배수와 9의배수를 출력하는 프로그램을 작성하라.
//단, 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.


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
