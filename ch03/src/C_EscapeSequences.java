public class C_EscapeSequences 
{

	public static void main(String[] args) 
	{
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C'); //캐리지리턴 A자리에 C를 넣은것. 도스로 실행시 CB로 출력됨

	}

}
