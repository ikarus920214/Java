package chapter06;

public class Quiz0611 
{

	public static void main(String[] args) 
	{
		int num1 = 0;
		int sum1 = 0;
		do {
			sum1 = num1 + sum1;
			num1 = num1 + 2; 
			
		} while(num1 <= 100);
		System.out.println("1부터 100까지 정수중 짝수의 합은 " + sum1 + "입니다.");

	}

}
