package com.week3;

public class Test1 {
	public static void main(String[] args) {
		
		Rect ob1 = new Rect();//Rect라는 클래스를 ob1이라는 이름의 new Rect();라는 생성자로 새로 지정해준다
		
		ob1.input();//input은 메소드명
		
		int a = ob1.area(); // int a 에 ob1.area();의 반환값이 반환되어 입력된다.
		
		int l = ob1.length(); 
		
		ob1.print(a, l);
		
	}
}
