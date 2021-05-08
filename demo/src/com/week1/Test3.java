package com.week1;

public class Test3 {

	public static void main(String[] args) {
		
		int r = 10;
		float area,length;
		
		area = r*r*3.14f;
		length = r*2*3.14f;
		
		System.out.printf("반지름: %d, 넓이: %f, 둘레: %f\n",r,area,length);
		System.out.printf("반지름: %d, 넓이: %.2f, 둘레: %.2f\n",r,area,length);
		
		
		//byte,short,int,long : 정수
		//float,double : 실수 
		
		int a=5;
		float b=5;
		
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
