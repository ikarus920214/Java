import java.util.Scanner;

public class Quiz0203 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ���.");
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d ������ %d �� ���� %d �Դϴ�.\n", num1, num2, num1/num2);
		System.out.printf("%d ������ %d �� �������� %d �Դϴ�.\n", num1, num2, num1%num2);
		

	}

}
