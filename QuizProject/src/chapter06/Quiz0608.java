package chapter06;

public class Quiz0608 
{

	public static void main(String[] args) 
	{
		for(int i = 2; i < 10; i = i+2) {
			for(int j = 1; j <= i; j++)
				System.out.println(i + " X " + j + " = " + (i * j));
		}

	}

}
