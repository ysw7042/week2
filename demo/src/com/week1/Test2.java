package com.week1;

public class Test2 {
	
	public static void main(String[] args) {
		
		// 자료형 변수이름
		int a = 15;
		int b = 5;
		
		int c,d;//쓰레기값
		// int c;
		// int d;
		
		c = a + b;
		d = a - b;
		
		System.out.println("a변수값: "+ a);
		System.out.println("b변수값: "+ b);
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d\n",a,b,d);
		

	}
}
