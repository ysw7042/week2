package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1,num2;
		
		
		System.out.print("첫번째수?");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째수?");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d\t", num1,num2,(num1+num2));
		System.out.printf("%d - %d = %d\n", num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\t", num1,num2,(num1*num2));
		System.out.printf("%d / %d = %d\n", num1,num2,(num1/num2));
		System.out.printf("%d %% %d = %d\n", num1,num2,(num1%num2)); // %는 %% 두번 써줘야 한다.
		
		// > , < , >=, <=, 등호연산자
		// !=, == 등가연산자 
		System.out.println("num1>num2 : "+ (num1>num2));//true
		System.out.println("num1<num2 : "+ (num1<num2));//false
		
		
		String str;
		
		//삼항 연산자
		str = num1%2==0?"짝수":"홀수"; // num1을 2로 나누어서 나머지가 0과 같으면 "짝수"를 출력 아니라면 "홀수"
		
		System.out.println(str);
		
		str = num1>0?"양수":(num1<0?"음수":"영"); //num1>0?"양수":(num1<0?"음수":"영") num1과 0을 비교했을 때 크면 양수, 아니라면 0과 비교했을때 0보다 작으면 음수 출력 아니라면 "영" 출력  
		
		System.out.println(str);
		
		//A && (and) B :A,B 둘 다 true이면 : true
		//A || (or) B :A,B 둘 중에 하나만 true이면 : true 
		// && 와 || 연산자는 &&연산자 먼저 계산

		str = num1%4==0 && num1%100!=0 || num1%400==0 ? "윤년" : "평년"; //num1%4==0 && num1%100!=0  // || num1%400==0 두가지는 별개의 조건이다. 
		
		System.out.println(str);
		
		
	}

}
