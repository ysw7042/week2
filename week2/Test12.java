package com.week2;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {//달력 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("년도?");//2021
			 y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//윤년에 따른 2월달의 날수 계산
		if(y%4==0 && y%100!=0 || y%400==0) {
			month[1] = 29;
		}
		
		//1년1월1일 부터 (y-1)년 12월 31일까지의 날수(윤년포함)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; // &&는 - ||는 +
		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400; 윤년
		//System.out.println(nalsu);
		//System.out.println(yy);
		
		//index =   0  1  2  3  4  5  6  7  8  9 10 11  //코딩할 때의 계산
		//month = {31,28,31,30,31,30,31,31,30,31,30,31};
		//월 		1  2  3  4  5  6  7  8  9 10 11 12 //월의 계산
		
		//m-1월까지의 날수
		for(i=0;i<m-1;i++) {
			nalsu+= month[i];
		}
		
		
		//구하는 달의 1일의 날수
		nalsu += 1; //nalsu = nalsu + 1; 
		
		week = nalsu%7;
		
		
		// 요일 구하기
		
		
		//System.out.println(week);
		
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//공백 지정
		for(i=0;i<week;i++) {
			System.out.print("    ");//4칸
		}
		
		for(i=1;i<=month[m-1];i++) {
			
			System.out.printf("%4d",i);
			
			week++;
			
			if(week%7==0 ) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}

		System.out.println("------------------------------");
	}
}














