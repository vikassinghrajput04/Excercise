package com.exercise;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Excercise1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(today.getYear());
	}
}
