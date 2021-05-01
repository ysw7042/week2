package com.week2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("이름?"); //suzi
		name = sc.next();
		
		System.out.print("국어?");//50
		kor = sc.nextInt();
		
		String pan;
		
		if(kor>90) {//큰 수와 조건이 여러개인것을 위쪽에 기입 위에서 하나씩 코딩  
			pan = "수";
		}else if(kor>80){
			pan = "우";
		}else if(kor>70) {
			pan = "미";
		}else if(kor>60) {
			pan = "양";
		}else {
			pan = "가";
		}
		
		System.out.println(name+ ":" +pan);
		
		
		
		
		
		
	}
}








