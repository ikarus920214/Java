class ���
{
	String �̸�;
	int ����; 
	int Ű;
	
// ���() {};
	
	void �λ�() {
		System.out.println("�ȳ��ϼ���.");
	}
		void �λ�2() {
		System.out.println("�� ���ξ���.");
	}
	
}

class MyEarth 
{

	public static void main(String[] args) 
	{
		// '���'�̶� ���赵(Ŭ����)�� �̿��� ���(��ü) �����
		// ����� --> ��ü�� �޸𸮿� ����
		// ��� --> ������ ���~
		��� man1 = new ���();
		man1.�̸� = "ȫ�浿";
		man1.���� = 20;
		man1.Ű = 170;
		
		System.out.println(man1.�̸�);
		
		man1.�λ�();
		
		��� man2 = new ���();
		man2.�̸� = "�� ��";
		man2.���� = 28;
		man2.Ű = 188;
		
		System.out.println(man2.�̸�);
		man2.�λ�2();
	}

}
