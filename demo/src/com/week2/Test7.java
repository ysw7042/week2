package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum;
		
		
		while(true) {
			
			do {
				System.out.print("�� �Է�?");//100
				su = sc.nextInt();
			}while(su<1||su>5000);				//System.out.println("����!!");
			
			sum=0;
			
			for(int i=1;i<=su;i++) {
				
				sum+=i; //sum=sum+i;
				
				
			}
			
			System.out.println("1~" + su + "������ ��: "+ sum);
			
			System.out.print(" ��� �ҷ�?"); //y,Y,n,N
			
			char ch;
			ch = (char)System.in.read(); //1byte�� ���ڸ� �ϳ� �о
			
			if(ch!='y'&& ch!='Y') {//������ (!=)���� ���� ��� && ������
				System.out.println("���α׷� ����...");
				break;
			}
			
			
		}
		sc.close();
	}
}























