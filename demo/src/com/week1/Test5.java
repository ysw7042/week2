package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String name;
		int kor;
		int eng;
		int tot;
		
		//�Է�
		System.out.print("�̸�?"); //suzi
		name = br.readLine();
		
		System.out.print("����?");//30
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("����?");//50
		eng = Integer.parseInt(br.readLine());
		
		//����
		tot = kor + eng;
		
		//���
		System.out.printf("�̸�: %s, ���� : %d\n",name,tot);
		
	}

}
