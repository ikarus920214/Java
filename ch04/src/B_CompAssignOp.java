//굳이 쓸필요 없지만 알면 좋은 상식 복합 대입 연산자 예제
public class B_CompAssignOp 
{

	public static void main(String[] args) 
	{
		short num = 10;
		num = (short)(num + 77L); // 형 변환 안하면 컴파일 오류 발생
		
		int rate = 3;
		rate = (int)(rate * 3.5); // 형 변환 안하면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; //형 변환 필요하지 않다.
		
		rate = 3;
		rate *= 3.5; //형 변환 필요하지 않다.
		
		System.out.println(num);
		System.out.println(rate);
		

	}

}