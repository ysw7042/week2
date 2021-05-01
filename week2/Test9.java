package com.week2;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
		//switch 
		
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		
		System.out.print("1~3이내의 수?");
		num = sc.nextInt();
		
		
		switch(num) {//(num) 모든 자료형이 들어올 수 있다.
		
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("숫자 입력 오류!!");
			break;//생략 가능
		}

	}
}

























