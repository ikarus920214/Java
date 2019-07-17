import java.util.Scanner;

public class Quiz0202 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("제곱을 구하고 싶은 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.printf("%d 의 제곱은 %d 입니다.\n", num1, num1*num1);

	}

}
