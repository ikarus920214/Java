
public class A3_CondOp 
{

	public static void main(String[] args) 
	{
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값 : " + diff);
		// 삼항 연산자 조건식이 참이면 결과1, 거짓이면 결과2
		// (조건식) ? 결과1 : 결과2
	}

}
