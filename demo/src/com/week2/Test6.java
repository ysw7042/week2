package com.week2;

import java.util.Scanner;

//반복문(for,while,dowhile)

public class Test6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int dan;
		
		System.out.println("단 입력?");//7
		dan = sc.nextInt();
		
		//for(시작값;최대값;증가값)
		
		for(int i=1;i<=9;i++) {//i=i+1 시작값과 끝값과 증가값을 다 아는 경우 For문을 이용
			
			System.out.println(dan + " * "+ i + " = "+(dan*i));
			
		}
		System.out.println("\n----------------------\n");
		
		
		//초기값
		//while(최대값){
		// 증가값
		//}
		
		int j=0;
		while(j<9) {//반복 횟수를 모를경우 while문 사용
			
			j++;	
			System.out.println(dan + "*"+ j + "=" + (dan*j));
		}
		
		/*
		int k=0;
		while(k<9) {
			k++;
			System.out.println(dan + "*"+ k + "=" + (dan*k));
		}
		*/
		System.out.println("\n----------------------\n");
		
		
		//do~while(최대값);
		
		
		//초기값
		//do{
		//	증가값
		//}while(최대값);
		
		int k=0;
		do {//사용자에게 값을 받아내고 나서 처리할때 사용
			k++;
			System.out.println(dan + " * "+ k + " = " +(dan*k));
			
		}while(k<9);
		
		
		sc.close();
		
		
		
		
		
	}
}






















