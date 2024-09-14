package com.basic;

public class StrDemo {
	public static void main(String[] args) {

		String s1 = "A Book On Java";
		String s2 = new String("I Like it");
		char arr[] = { 'D', 'R', 'E', 'A', 'M', 'T', 'E', 'C', 'H', 'P', 'R', 'E', 'S', 'S' };
		String s3 = new String(arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1+" form "+s3);
		boolean x = s1.startsWith("A");
		if (x) {
			System.out.println("s1 starts with \'A\'");
		}else
			System.out.println("s1 does not starts with \'A\'");
		String p = s2.substring(0, 6);
		String q = s3.substring(0, 9);
		System.out.println(p+q);
		System.out.println();
		System.out.println(s1);
		System.out.println(s3.toLowerCase());
		
		String s4 ="Hello, this is a book on java";
		char arr1[] = new char[14];
		s4.getChars(7, 21, arr1, 0);
		System.out.println(arr1);
		
		String str = "Hello, this is a book on java";
		String s[] ;
		s = str.split(" ");
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}
}