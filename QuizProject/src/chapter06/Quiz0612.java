package chapter06;

import java.util.Scanner;

public class Quiz0612 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두가지 정수를 입력해주세요.");
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		int sum1 = 0;
		// 6      2
		if(num1 > num2) {
			for(int i = num1; i >= num2; i--) {
				System.out.print(i);
				sum1 = i+sum1;
				if(i != num2) {
					System.out.print(" + ");
				}
				
			}
			System.out.print("=" + sum1);
		}else {
			for(int i = num1; i<= num2; i++) {
				System.out.print(i);
				sum1= sum1+i;
				if(i < num2) {
					System.out.print(" + ");
				}
				
			}
			System.out.println("=" + sum1);
		
		}
		
		
				
			
			
		}
		
		
	
		
		

	}


