package com.MergeSwap;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is swapping method without third variable, using XOR
		int a=5,b=4;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Swapped value of a is "+a+" b is "+b);

	}

}
