package com.week3;

import java.util.Scanner;

class Hap{
	
	int su,sum;//�ν��Ͻ�(Instance) ����
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�?");//100
		su = sc.nextInt();
				
	}
	
	public int cnt() {
		
		for(int i=1;i<=su;i++) {
			
			sum+=i;//�ʱ�ȭ�� �� �ʿ䰡 ���� ������ �ν��Ͻ� ������ �ʱⰪ�� �����Ǿ��ֱ� ����
		}
		
		return sum;
	}
	
	public void print(int s) {
		System.out.println("1~" + su + "������ �� : "+ s);
	}
	
	
}

public class Test2 {
	public static void main(String[] args) {
		
		Hap h = new Hap();//ù��° ��ü 	
		h.input();//10
		int i = h.cnt();
		h.print(i);
		
		Hap h1 = new Hap();//�ι�° ��ü		
		h1.input();//100
		i = h1.cnt();
		h1.print(i);
		
		
		System.out.println(h.su);//10
		System.out.println(h1.su);//100
	}
}
