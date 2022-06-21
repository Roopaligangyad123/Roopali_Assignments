package com.cg.strings;

public class Problem1{
	public static void main(String[] args) {
		//Q1.
		String str="Hello World";
		System.out.println(str.length());
		//Q2.
		String a="Hello,";
		String b="How are you?";
		String x=a.concat(b);
		System.out.println(x);
		//Q3.
		String one="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(one.toLowerCase());
		System.out.println(one.toUpperCase());
		System.out.println(one.replace('a','$'));
		System.out.println(one.contains("collection"));
		String two="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(one.compareTo(two));
		System.out.println(one.equals(two));
	}

}