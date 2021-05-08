package com.week2;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {//달력 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,d,nalsu,i,week;
		
		do {
			System.out.print("년도?");//2021
			 y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("일?");//23
			d = sc.nextInt();
		}while(d<1 || d>31);
		
		//윤년에 따른 2월달의 날수 계산
		if(y%4==0 && y%100!=0 || y%400==0) {
			month[1] = 29;
		}
		
		//1년1월1일 부터 (y-1)년 12월 31일까지의 날수(윤년포함)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; // &&는 - ||는 +
		
		
		//m-1월까지의 날수
		for(i=0;i<m-1;i++) {
			nalsu+= month[i];
		}
		
		
		//구하는 달(m)의 d일의 날수
		nalsu += d; //nalsu = nalsu + 1; 
		
		week = nalsu%7;
		
		String[] date = {"일","월","화","수","목","금","토",};
		
		System.out.printf("%d년 %d월 %d일 %s요일",y,m,d,date[week]);
		
		sc.close();
	}
}














