package com.cts.Examples;

import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		StringBuilder st = new StringBuilder(s);
		st.reverse();
		for(int i=1; i < st.length(); i+=2) {
			st.insert(i,"-");
		}
		System.out.println(st);
	}

}
