package com.week2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("�̸�?"); //suzi
		name = sc.next();
		
		System.out.print("����?");//50
		kor = sc.nextInt();
		
		String pan;
		
		if(kor>90) {//ū ���� ������ �������ΰ��� ���ʿ� ���� ������ �ϳ��� �ڵ�  
			pan = "��";
		}else if(kor>80){
			pan = "��";
		}else if(kor>70) {
			pan = "��";
		}else if(kor>60) {
			pan = "��";
		}else {
			pan = "��";
		}
		
		System.out.println(name+ ":" +pan);
		
		
		
		
		
		
	}
}








