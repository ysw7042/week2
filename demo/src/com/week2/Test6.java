package com.week2;

import java.util.Scanner;

//�ݺ���(for,while,dowhile)

public class Test6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int dan;
		
		System.out.println("�� �Է�?");//7
		dan = sc.nextInt();
		
		//for(���۰�;�ִ밪;������)
		
		for(int i=1;i<=9;i++) {//i=i+1 ���۰��� ������ �������� �� �ƴ� ��� For���� �̿�
			
			System.out.println(dan + " * "+ i + " = "+(dan*i));
			
		}
		System.out.println("\n----------------------\n");
		
		
		//�ʱⰪ
		//while(�ִ밪){
		// ������
		//}
		
		int j=0;
		while(j<9) {//�ݺ� Ƚ���� �𸦰�� while�� ���
			
			j++;	
			System.out.println(dan + "*"+ j + "=" + (dan*j));
		}
		
		/*
		int k=0;
		while(k<9) {
			k++;
			System.out.println(dan + "*"+ k + "=" + (dan*k));
		}
		*/
		System.out.println("\n----------------------\n");
		
		
		//do~while(�ִ밪);
		
		
		//�ʱⰪ
		//do{
		//	������
		//}while(�ִ밪);
		
		int k=0;
		do {//����ڿ��� ���� �޾Ƴ��� ���� ó���Ҷ� ���
			k++;
			System.out.println(dan + " * "+ k + " = " +(dan*k));
			
		}while(k<9);
		
		
		sc.close();
		
		
		
		
		
	}
}






















