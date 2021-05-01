package com.week2;

import java.util.Scanner;

public class Test3 {
	public static void main(String []args) {
		
		Scanner sc =new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		//System.out.print("이름 국어 영어 수학?");//suzi 40 60 50 //Scanner는 입력 시 공백을 만나면 멈추고 다음 명령을 실행한다.
		System.out.print("이름,국어,영어,수학?");//suzi 40 60 50
		
		
		sc = new Scanner(sc.next()).useDelimiter(","); // (\\s*,\\s*") (\\s*=>) 공백
															   // ,를 구분자로 사용이 된다.
		
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":"+ (kor+eng+mat) + "점");
		
		
	}
}

















