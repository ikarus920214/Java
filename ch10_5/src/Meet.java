// �������̽��� ��� ���谡 �ƴ� Ŭ������
// ����� �����ϴ� ����.
// Ŭ������ ����� ����������,
// ���ǿ� �߻� �޼��常�� ����� �� �� �ִ�.

interface Greet
{
	void greet();
}

interface Talk
{
	void talk();
}

class Morning implements Greet, Talk
{
	public void greet()
	{
		System.out.println("�ȳ��ϼ���!");
	}
	
	public void talk()
	{
		System.out.println("���� ���׿�.");
	}
}

public class Meet 
{

	public static void main(String[] args) 
	{
		Morning morning = new Morning();
		morning.greet();
		morning.talk();

	}

}
