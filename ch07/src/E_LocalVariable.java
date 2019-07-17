
public class E_LocalVariable 
{

	public static void main(String[] args) 
	{
		boolean ste = true;
		int num1 = 11;
		
		if(ste) {
			//int num1 = 22; 지역안에 num1이 변수선언이 됬기때문에 같은 이름으로 쓸수없다
			num1++;
			System.out.println(num1);
		}
		
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		
		// System.out.println(num2); 지역을 벗어났기 때문에 num2의 값이 없다. 
	}

}
