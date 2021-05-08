package com.week3;

import java.util.Scanner;

class Hap{
	
	int su,sum;//인스턴스(Instance) 변수
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력?");//100
		su = sc.nextInt();
				
	}
	
	public int cnt() {
		
		for(int i=1;i<=su;i++) {
			
			sum+=i;//초기화를 할 필요가 없는 이유는 인스턴스 변수는 초기값이 지정되어있기 때문
		}
		
		return sum;
	}
	
	public void print(int s) {
		System.out.println("1~" + su + "까지의 합 : "+ s);
	}
	
	
}

public class Test2 {
	public static void main(String[] args) {
		
		Hap h = new Hap();//첫번째 객체 	
		h.input();//10
		int i = h.cnt();
		h.print(i);
		
		Hap h1 = new Hap();//두번째 객체		
		h1.input();//100
		i = h1.cnt();
		h1.print(i);
		
		
		System.out.println(h.su);//10
		System.out.println(h1.su);//100
	}
}
