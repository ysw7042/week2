package com.week2;

import java.util.Scanner;

public class Test3 {
	public static void main(String []args) {
		
		Scanner sc =new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		//System.out.print("�̸� ���� ���� ����?");//suzi 40 60 50 //Scanner�� �Է� �� ������ ������ ���߰� ���� ����� �����Ѵ�.
		System.out.print("�̸�,����,����,����?");//suzi 40 60 50
		
		
		sc = new Scanner(sc.next()).useDelimiter(","); // (\\s*,\\s*") (\\s*=>) ����
															   // ,�� �����ڷ� ����� �ȴ�.
		
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + ":"+ (kor+eng+mat) + "��");
		
		
	}
}

















