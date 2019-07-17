package chapter13_1;

import java.util.Scanner;

public class Quiz1305 {

	public static void main(String[] args) {
		System.out.println("단어를 입력하시오.");
		Scanner sc = new Scanner(System.in);
//		StringBuilder name = new StringBuilder();
		String name1 = sc.nextLine();
		
		int nLen = name1.length();
		String[] name2 = new String[nLen];
		for (int i=0; i<nLen; i++) {
			name2[i] = name1.substring(i, i+1);
		}
		
		String[] name3 = name1.split("");
		char[] name4 = name1.toCharArray();
		
		boolean bCheck = true;
		for( int i=0; i<nLen/2; i++) {
			if(!name2[i].equals(name2[nLen-i])) {
				bCheck = false;
				break;
			}
		}
		if (bCheck = true) {
			System.out.println("회문 입니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}

//		String name2 = name.append(name1).reverse().toString();
//
//		if (name1.equals(name2)) {
//			System.out.println("회문 입니다.");
//
//		} else
//			System.out.println("회문이 아닙니다.");

	}

}
