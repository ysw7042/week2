package com.week3;

import java.util.Scanner;

public class Rect {
	
	int w,h;//��������(instance ����)
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ΰ�?");//10
		w = sc.nextInt();
		
		System.out.print("���ΰ�?");//20
		h = sc.nextInt();
		
		//return;
	}
		
	public int area() {
		
		int result;//��������
		
		result = w*h;
		
		return result;
		
	}
	
	public int length() {
		
		return(w+h)*2;
		
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("���� : "+ w);
		System.out.println("���� : "+ h);
		System.out.println("���� : "+ a);
		System.out.println("�ѷ� : "+ l);
		
	}
	
	
}





