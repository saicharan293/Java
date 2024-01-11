package com.Cuboid;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth,height;
		int totalArea,volume;
		System.out.println("Enter the length, breadth, height");
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		volume=length*breadth*height;
		totalArea=2*(length*breadth+breadth*height+height*length);
		
		System.out.println("Total Area is : "+totalArea);
		System.out.println("Total Volume is : "+volume);
		sc.close();
	}

}
