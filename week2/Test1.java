package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException{
	
	
		
		//제어문
		//if,for,while,do~while,switch
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num = 0;
		String str ; //null을 입력할 때도 있음 
					 //단일 if문에서는 아래의 오류가 발생 할 수 있다.
					 //The local variable str may not have been initialized =>변수를 초기화 해라( str에는 쓰레기값이 들어가있기 때문에 초기화를 해주지 않으면 에러가 발생)
		
		
		System.out.print("수 입력?");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		if(조건문) {
			작업1;
		}
		*/
		
		
		/*
		if(num%2==0) {//단일 if문
			str = "짝수";
		}
		
		if(num%2!=0)//작업이 1개인 경우 중괄호를 생략 가능 (작업이 하나인 것은 세미콜론; 을 참고) 
			str ="홀수";
		*/
		
		
		if(num%2==0) {
			str = "짝수";
		}else {
			str = "홀수";
		} //if else 문
		
		
		
		System.out.println(num + ":"+ str);
		
		
		
	}
}









