package com.week3;

import java.util.Scanner;

public class Rect {
	
	int w,h;//전역변수(instance 변수)
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로값?");//10
		w = sc.nextInt();
		
		System.out.print("세로값?");//20
		h = sc.nextInt();
		
		//return;
	}
		
	public int area() {
		
		int result;//지역변수
		
		result = w*h;
		
		return result;
		
	}
	
	public int length() {
		
		return(w+h)*2;
		
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("가로 : "+ w);
		System.out.println("세로 : "+ h);
		System.out.println("넓이 : "+ a);
		System.out.println("둘레 : "+ l);
		
	}
	
	
}





