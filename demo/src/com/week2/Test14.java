package com.week2;

import com.week3.Rect;//재사용성 

public class Test14 {

	public static void main(String[] args) {
		
		Rect usa = new Rect();
		
		usa.input();
		int a = usa.area();
		int l = usa.length();
		usa.print(a, l);
		
	}

}
