package com.score;

import java.util.Scanner;

public class Score {
	
	Scanner sc = new Scanner(System.in);
	
	int number;
	Record[] rec;
	
	public void set() {
		
		
		do {
			System.out.print("인원수?");//3
			number = sc.nextInt();
		}while(number<1||number>10);//10명의 데이터를 기입할 수 있다. 
		
		rec = new Record[number];	
		
	}
	
	public void input() {
		
		for(int i=0;i<number;i++) {//number는 rec[].length이다 
		rec[i] = new Record();
		
		System.out.print("이름?");//suzi
		rec[i].name = sc.next();
		
		System.out.print("국어?");//30
		rec[i].kor = sc.nextInt();
		
		System.out.print("영어?");//40
		rec[i].eng = sc.nextInt();
		
		System.out.print("수학?");//50
		rec[i].mat = sc.nextInt();
		
		rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
		
		rec[i].ave = rec[i].tot / 3;
		}
		
	}
	
	private void ranking() {
		
		
		int i,j;
		
		//초기화 
		for(i=0;i<number;i++) {//rec[i]의 rank의 초기값을 1로 초기화
			rec[i].rank = 1;
		}
		
		//석차 구하기
		for(i=0;i<number-1;i++) {//test4 참조
			
			for(j=i+1;j<number;j++) {
			
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++; 
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
					
			}
			
		}
		
	}
	
	
	
	
	public void print() {
		
		ranking(); //외부에서 private 접근은 불가능하기 때문에 ranking(); 을 print(); 내부에 호출하였다.
		
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
