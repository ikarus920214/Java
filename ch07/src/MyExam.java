
public class MyExam 
{

	public static void main(String[] args) 
	{
		// �Ķ���� ���� ��ȯ ���� �޼���
		Hello();
		
		// �Ķ���� �ְ� ��ȯ ���� �޼���
		MyAdd(1, 2);
		
		// �Ķ���� ���� ��ȯ �ִ� �޼���
		int temper = Temper();
		System.out.println(temper);
		System.out.println( Temper() );
		
		// �Ķ���� �ְ� ��ȯ �ִ� �޼���
		int sum = TwoNumAdd(1, 2);
		System.out.println("���� " + sum);

	}
	
	public static int TwoNumAdd(int num1, int num2) {
		return num1 + num2;
		
	}
	
	
	public static int Temper() {
		return 16;
		
	}
	
	
	public static void MyAdd(int num1, int num2) {
		int nResult = num1 +num2;
		System.out.println(nResult);
	}
	
	public static void Hello() {
		System.out.println("Hello");
	}

}
