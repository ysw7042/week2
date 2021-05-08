package com.week2;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner는 기본적으로 공백을 인식한다.

		int[] num = new int[5];//문자열로 저장하고 싶으면 String으로 문자형변환 해주면 된다.
		
		System.out.print("다섯개의 정수?"); // 4 6 2 8 9
		
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("배열의 갯수 : " + num.length);// 배열의 갯수를 세는것은 변수이다 (.length)

		for (int su : num) {//확장for문
			System.out.print(su + " ");
		}//java.lang.ArrayIndexOutOfBoundsException : 배열의 범위를 벗어나서 나타나는 에러 
		
		System.out.println();
		
		num[3] = 400;
		
		System.out.println("num[3]: "+num[3]);
		
		int a = num[1];
		
		System.out.println(a);//20
		
		sc.close();
		
	}
}













