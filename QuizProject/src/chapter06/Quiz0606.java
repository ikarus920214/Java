//사용자로부터 다음 순서대로 정수를 입력받은 후 평균을 구하여 출력하는 프로그램을 작성하시오.
//몇개의 정수를 입력할 지 사용자로부터 입력받는다.
//입력받은 숫자만큼 정수를 입력받는다.(1번에서 3이라고 입력했다면 3개의 정수를 입력받아야 한다)
//입력받은 숫자들의 평균값을 구하여 출력한다. 평균값은 소수점 이하까지 계산해야 한다.

package chapter06;

import java.util.Scanner;

public class Quiz0606 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 개수를 입력해주세요.");
		int num1 = sc.nextInt();
		double result = 0;

		for (int i = 0; i < num1; i++) {
			int num2 = sc.nextInt();
			result = result + num2;

		}
		result = result / num1;
		System.out.println("입력한 값의 평균은" + result + "입니다.");

	}

}