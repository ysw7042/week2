package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		
		//����,����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//System.in : Ű����� �Է��� 1byte ���ڸ� �о
		//InputStreamReader : ���ڸ� 2byte�� ��ȯ
		//BufferedReader : ó�� �ӵ��� ���̱� ���� �޸𸮿� ���۸� ����� ���� 
		
		
		int r;
		double area,length;
		
		//�Է�
		System.out.print("������?"); //20
		
		r =Integer.parseInt(br.readLine());
		//Integer.parseInt �������� ���������� �ٲ��ش�
		
		//����
		area = r*r*3.14;
		length = r*2*3.14;
		
		//���
		System.out.println("������: " + r);
		System.out.println("����: " + area);
		System.out.println("�ѷ�: "+ length);
		
		
		
		
		
		
		
		
	}

}
