package com.week3;

public class Test1 {
	public static void main(String[] args) {
		
		Rect ob1 = new Rect();//Rect��� Ŭ������ ob1�̶�� �̸��� new Rect();��� �����ڷ� ���� �������ش�
		
		ob1.input();//input�� �޼ҵ��
		
		int a = ob1.area(); // int a �� ob1.area();�� ��ȯ���� ��ȯ�Ǿ� �Էµȴ�.
		
		int l = ob1.length(); 
		
		ob1.print(a, l);
		
	}
}
