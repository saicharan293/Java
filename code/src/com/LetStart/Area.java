package com.LetStart;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float height, base, area;
		System.out.println("Enter height and base values");
		Scanner sc=new Scanner(System.in);
		height=sc.nextFloat();
		base=sc.nextFloat();
		area=base*height*0.5f;
		System.out.println("Area of the triangle is: "+area);
	}

}
