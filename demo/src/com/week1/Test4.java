package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		
		//정의,선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//System.in : 키보드로 입력한 1byte 문자를 읽어냄
		//InputStreamReader : 문자를 2byte로 변환
		//BufferedReader : 처리 속도를 높이기 위해 메모리에 버퍼를 만들어 저장 
		
		
		int r;
		double area,length;
		
		//입력
		System.out.print("반지름?"); //20
		
		r =Integer.parseInt(br.readLine());
		//Integer.parseInt 문자형을 숫자형으로 바꿔준다
		
		//연산
		area = r*r*3.14;
		length = r*2*3.14;
		
		//출력
		System.out.println("반지름: " + r);
		System.out.println("넓이: " + area);
		System.out.println("둘레: "+ length);
		
		
		
		
		
		
		
		
	}

}
