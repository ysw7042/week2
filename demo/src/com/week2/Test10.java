package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("ù��° ��?");//20 30
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ��?");//5
		num2 =sc.nextInt();
		
		System.out.print("������[+,-,*,/]?");//+
		oper = (char)System.in.read();//������ �ޱ� ������ (char)�� �ڷ����� ��ȯ��Ų��
		
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
		
		
		
		sc.close();
		
		
		
	}
}
















