import java.util.Scanner;

public class Quiz0205 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해주세요.");
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("두 정수의 절대값은 %d 입니다.\n", num1 * num2 > 0 ? num1*num2 : num1*-num2);

	}

}
