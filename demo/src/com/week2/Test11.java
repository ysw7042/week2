package com.week2;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner�� �⺻������ ������ �ν��Ѵ�.

		int[] num = new int[5];//���ڿ��� �����ϰ� ������ String���� ��������ȯ ���ָ� �ȴ�.
		
		System.out.print("�ټ����� ����?"); // 4 6 2 8 9
		
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("�迭�� ���� : " + num.length);// �迭�� ������ ���°��� �����̴� (.length)

		for (int su : num) {//Ȯ��for��
			System.out.print(su + " ");
		}//java.lang.ArrayIndexOutOfBoundsException : �迭�� ������ ����� ��Ÿ���� ���� 
		
		System.out.println();
		
		num[3] = 400;
		
		System.out.println("num[3]: "+num[3]);
		
		int a = num[1];
		
		System.out.println(a);//20
		
		sc.close();
		
	}
}













