package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째 수?");//20 30
		num1 = sc.nextInt();
		
		System.out.print("두번째 수?");//5
		num2 =sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]?");//+
		oper = (char)System.in.read();//정수로 받기 때문에 (char)로 자료형을 변환시킨다
		
		switch(oper) {
		
		case '+':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
			break;
		case '-':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
			break;
		case '*':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
			break;
		case '/':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
			break;
		
		}
		
		
		
		
		
		
		
	}
}
















