// ���ڿ� ���� ��� �� ������ ������
// �ν��Ͻ��� ���� �� ��

public class A2_ImmutableString 
{

	public static void main(String[] args) 
	{
		String str1 = "Simple String";
		String str2 = "Simple String";
		//String str2 = str1;
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		// �ν��Ͻ��� ���� �� ��
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");

	}

}
// == : ���������� ���� �� ��
// String �ν��Ͻ��� immutable �ν��Ͻ�!
// ���� �����Ǵ� �ν��Ͻ��� ���� �ּ�ȭ �Ѵ�.