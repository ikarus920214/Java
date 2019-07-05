
public class E_SCE 
{

	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0); //복합 대입 연산자 a = a + b 같다 a += b 10 += 10 = 20 
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}

}
