package com.week2;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {//�޷� �����
		
		Scanner sc = new Scanner(System.in);
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,d,nalsu,i,week;
		
		do {
			System.out.print("�⵵?");//2021
			 y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("��?");//23
			d = sc.nextInt();
		}while(d<1 || d>31);
		
		//���⿡ ���� 2������ ���� ���
		if(y%4==0 && y%100!=0 || y%400==0) {
			month[1] = 29;
		}
		
		//1��1��1�� ���� (y-1)�� 12�� 31�ϱ����� ����(��������)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400; // &&�� - ||�� +
		
		
		//m-1�������� ����
		for(i=0;i<m-1;i++) {
			nalsu+= month[i];
		}
		
		
		//���ϴ� ��(m)�� d���� ����
		nalsu += d; //nalsu = nalsu + 1; 
		
		week = nalsu%7;
		
		String[] date = {"��","��","ȭ","��","��","��","��",};
		
		System.out.printf("%d�� %d�� %d�� %s����",y,m,d,date[week]);
		
		sc.close();
	}
}














