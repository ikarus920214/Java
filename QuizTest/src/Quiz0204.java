import java.util.Scanner;

public class Quiz0204 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է����ּ���.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("ū ���� %d �Դϴ�.\n", num1 > num2 ? num1 : num2);
		

	}

}
