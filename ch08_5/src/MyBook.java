class Book
{
	int price;
	int num =0;
	String title;
	
	Book()
	{
		title = "�ڹ� ���α׷���";
		price = 5000;
	}
	
	Book(String t, int p)
	{
		title = t;
		price = p;
	}
	
	void print()
	{
		System.out.println("��    �� : " + title);
		System.out.println("��    �� : " + price);
		System.out.println("�ֹ����� : " + num);
		System.out.println("�հ�ݾ� : " + price * num);
	}
}

public class MyBook 
{

	public static void main(String[] args) 
	{
		Book book1 = new Book("�ڹ� ����������", 10000);
		book1.num = 10;
		book1.print();

	}

}
// �����ڴ� Ŭ���� �̸��� ���� �޼������ ������.
// �����ڴ� �޼��������� �������� ����(void�� ����.)
//
// ����Ʈ ������(�Ķ���� ���� ��)�� �ڵ����� �����ȴ�.
//
// �Ķ���Ͱ� �ִ� �����ڸ� ����� (�����ε��ϸ�)
// ����Ʈ �����ڰ� �ڵ����� �������� �ʴ´�.