import java.util.Scanner;

public class Quiz0204 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("큰 값은 %d 입니다.\n", num1 > num2 ? num1 : num2);
		

	}

}
