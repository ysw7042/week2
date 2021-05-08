package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum;
		
		
		while(true) {
			
			do {
				System.out.print("수 입력?");//100
				su = sc.nextInt();
			}while(su<1||su>5000);				//System.out.println("성공!!");
			
			sum=0;
			
			for(int i=1;i<=su;i++) {
				
				sum+=i; //sum=sum+i;
				
				
			}
			
			System.out.println("1~" + su + "까지의 합: "+ sum);
			
			System.out.print(" 계속 할래?"); //y,Y,n,N
			
			char ch;
			ch = (char)System.in.read(); //1byte의 문자를 하나 읽어냄
			
			if(ch!='y'&& ch!='Y') {//양쪽이 (!=)같지 않을 경우 && 연산자
				System.out.println("프로그램 종료...");
				break;
			}
			
			
		}
		sc.close();
	}
}























