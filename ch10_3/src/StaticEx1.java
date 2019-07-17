// static의 이해

class Cat
{
	static int a = 5;
	int num = 3;
	
	void Print(int num3) {
		System.out.println("a:"+a);
		num = num3;
		System.out.println("num:"+num);
	}
}

public class StaticEx1 
{

	public static void main(String[] args) 
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		
		Cat cat1 = new Cat();
		cat1.num = 1;
		cat1.a = 10;
		cat1.Print(20);
		System.out.println(cat1.num);
		System.out.println(cat1.a);
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		cat2.a = 11;
		cat2.Print(20);
		System.out.println(cat2.num);
		System.out.println(cat2.a);
		System.out.println(cat1.a);

	}

}
// static int a = 5; 메서드(클래스) 영역에서 변수 메모리 할당
// 다른 변수들은 스택영역에서 변수 메모리 할당
// static 변수는 저장하는 느낌 마지막에 들어간 값이 저장됨. cat1.a =10 뒤에 cat2.a = 11 넣으면 값이 11이 됨.
// 스택영역 변수는 사라짐