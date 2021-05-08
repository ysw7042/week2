package com.score;

import java.util.Scanner;

public class Score {
	
	Scanner sc = new Scanner(System.in);
	
	int number;
	Record[] rec;
	
	public void set() {
		
		
		do {
			System.out.print("�ο���?");//3
			number = sc.nextInt();
		}while(number<1||number>10);//10���� �����͸� ������ �� �ִ�. 
		
		rec = new Record[number];	
		
	}
	
	public void input() {
		
		for(int i=0;i<number;i++) {//number�� rec[].length�̴� 
		rec[i] = new Record();
		
		System.out.print("�̸�?");//suzi
		rec[i].name = sc.next();
		
		System.out.print("����?");//30
		rec[i].kor = sc.nextInt();
		
		System.out.print("����?");//40
		rec[i].eng = sc.nextInt();
		
		System.out.print("����?");//50
		rec[i].mat = sc.nextInt();
		
		rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
		
		rec[i].ave = rec[i].tot / 3;
		}
		
	}
	
	private void ranking() {
		
		
		int i,j;
		
		//�ʱ�ȭ 
		for(i=0;i<number;i++) {//rec[i]�� rank�� �ʱⰪ�� 1�� �ʱ�ȭ
			rec[i].rank = 1;
		}
		
		//���� ���ϱ�
		for(i=0;i<number-1;i++) {//test4 ����
			
			for(j=i+1;j<number;j++) {
			
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++; 
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
					
			}
			
		}
		
	}
	
	
	
	
	public void print() {
		
		ranking(); //�ܺο��� private ������ �Ұ����ϱ� ������ ranking(); �� print(); ���ο� ȣ���Ͽ���.
		
		for(int i=0;i<number;i++) {
			
			System.out.printf("%6s",rec[i].name);
			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].ave);
			System.out.printf("%4d\n",rec[i].rank);
	
		}
	}
	
	
	
}
