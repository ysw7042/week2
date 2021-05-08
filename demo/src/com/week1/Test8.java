package com.week1;

import java.io.IOException;

public class Test8 {

	public static void main(String[] args) throws IOException {
		
		//char ch = 'a'//97;
		
		char ch;
		char result;
		
		System.out.println("한개의 문자?");//a(97)
		ch = (char)System.in.read();
		
		//System.out.println(ch); //a
		//System.out.println(Integer.toString(ch));//97
		
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a'&&ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch + " : " + result);
		
	}

}
