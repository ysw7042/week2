package com.week2;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {//�޷� �����
		
		Scanner sc = new Scanner(System.in);
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("�⵵?");//2021
			 y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//���⿡ ���� 2������ ���� ���
		if(y%4==0 && y%100!=0 || y%400==0) {
			month[1] = 29;
		}
		
		//1��1��1�� ���� (y-1)�� 12�� 31�ϱ����� ����(��������)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; // &&�� - ||�� +
		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400; ����
		//System.out.println(nalsu);
		//System.out.println(yy);
		
		//index =   0  1  2  3  4  5  6  7  8  9 10 11  //�ڵ��� ���� ���
		//month = {31,28,31,30,31,30,31,31,30,31,30,31};
		//�� 		1  2  3  4  5  6  7  8  9 10 11 12 //���� ���
		
		//m-1�������� ����
		for(i=0;i<m-1;i++) {
			nalsu+= month[i];
		}
		
		
		//���ϴ� ���� 1���� ����
		nalsu += 1; //nalsu = nalsu + 1; 
		
		week = nalsu%7;
		
		
		// ���� ���ϱ�
		
		
		//System.out.println(week);
		
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//���� ����
		for(i=0;i<week;i++) {
			System.out.print("    ");//4ĭ
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














