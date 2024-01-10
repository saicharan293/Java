package com.LetStart;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the base, height and width");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		float s=(a+b+c)/2f;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of second triangle is: "+area);

	}

}
