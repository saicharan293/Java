package com.Quad;

import java.util.Scanner;

public class QuadRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double r1,r2;
		System.out.println("Enter the coefficients: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		r1=(-b+ Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("Roots of the quadratic equations are"+r1+" and "+r2);
		sc.close();

	}

}
