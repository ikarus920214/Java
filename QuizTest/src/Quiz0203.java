import java.util.Scanner;

public class Quiz0203 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d 나누기 %d 의 몫은 %d 입니다.\n", num1, num2, num1/num2);
		System.out.printf("%d 나누기 %d 의 나머지는 %d 입니다.\n", num1, num2, num1%num2);
		

	}

}
