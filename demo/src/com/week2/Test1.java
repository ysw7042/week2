package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException{
	
	
		
		//���
		//if,for,while,do~while,switch
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num = 0;
		String str ; //null�� �Է��� ���� ���� 
					 //���� if�������� �Ʒ��� ������ �߻� �� �� �ִ�.
					 //The local variable str may not have been initialized =>������ �ʱ�ȭ �ض�( str���� �����Ⱚ�� ���ֱ� ������ �ʱ�ȭ�� ������ ������ ������ �߻�)
		
		
		System.out.print("�� �Է�?");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		if(���ǹ�) {
			�۾�1;
		}
		*/
		
		
		/*
		if(num%2==0) {//���� if��
			str = "¦��";
		}
		
		if(num%2!=0)//�۾��� 1���� ��� �߰�ȣ�� ���� ���� (�۾��� �ϳ��� ���� �����ݷ�; �� ����) 
			str ="Ȧ��";
		*/
		
		
		if(num%2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		} //if else ��
		
		
		
		System.out.println(num + ":"+ str);
		
		
		
	}
}









