package chapter06;

public class Quiz0604 
{

	public static void main(String[] args) 
	{
		int num1 = 1;
		int num2 = 0;
		
		do {
			num2 += num1;
			System.out.print(num1 + "+");
			num1++;
		} while(num1 <= 1000);
		
		System.out.println(" = " + num2 + " ÀÔ´Ï´Ù.");

	}

}
