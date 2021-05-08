package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String name;
		int kor;
		int eng;
		int tot;
		
		//입력
		System.out.print("이름?"); //suzi
		name = br.readLine();
		
		System.out.print("국어?");//30
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어?");//50
		eng = Integer.parseInt(br.readLine());
		
		//연산
		tot = kor + eng;
		
		//출력
		System.out.printf("이름: %s, 총점 : %d\n",name,tot);
		
	}

}
