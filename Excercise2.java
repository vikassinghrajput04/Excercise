package com.excercise.hs;

public class Excercise2 {

	public static void main(String[] args) {
		
		String s = "Vijay Chouhan";
		
		String s2 = s.substring(s.indexOf(" "), 13);
		System.out.println(s2);
	
		String str[]=s.split(" ");
		for (String string : str) {
			System.out.println(string);
		}
	
	}
}
