package com.strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java";
		String str2=new String("java");
		String str3="Java";
		
		//.equals method checks whether given strings contain the same content irrespective 
		//of case sensitivity
		System.out.println(str1.equals(str2));
		
		//'==' checks whether both references pointing to the same address or not
		System.out.println(str1==str2);
		
		//.compareTo returns 
		//0 if both the strings contain same content along with case sensitivity
		System.out.println(str1.compareTo(str2));
		
		//32 since difference of ascii code of str1 is greater than str3, is displayed
		System.out.println(str1.compareTo(str3));
		

	}

}
