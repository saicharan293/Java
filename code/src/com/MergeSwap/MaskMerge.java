package com.MergeSwap;

public class MaskMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=9,b=12,c;
		//This performs the left shift and stores a value in the first four bits(nibble)
		c=(byte)(a<<4);
		//OR operation combines b value with left shifted value of c, resulting in merging operation
		c=(byte)(c|b);
		//to find out number present in left nibble
		System.out.println((c&0b11110000)>>4);
		System.out.println(c&0b00001111);
		

	}

}
