import java.util.Scanner;

public class Quiz0205 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է����ּ���.");
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.printf("�� ������ ���밪�� %d �Դϴ�.\n", num1 * num2 > 0 ? num1*num2 : num1*-num2);

	}

}
