package com.strings;

public class StringChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programmer@gmail.com";
		int firstIndex=str.indexOf('@');
		
		String userName=str.substring(0, firstIndex);
		System.out.println("user name:"+userName);
		
		//first method using .equals method or .compareTo method
		int secondIndex=str.indexOf(".");
		String domainName=str.substring(firstIndex+1,secondIndex);
		System.out.println("domainName 1 :"+domainName);
		System.out.println(domainName.equals("gmail"));
		
		//second method using .startsWith method
		String domainName2=str.substring(firstIndex+1, str.length());
		System.out.println("domain Name 2 :"+ domainName2);
		System.out.println(domainName2.startsWith("gmail"));

	}

}
