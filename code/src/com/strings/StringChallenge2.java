package com.strings;

public class StringChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=101011;
		String str=String.valueOf(b);
		
		//[]+ indicates, the string must contain atleast one value
		System.out.println(str.matches("[01]+"));
		//[]* indicates, the string contain more than one value
		System.out.println(str.matches("[01]*"));
		//[] indicates, the string contain either of the value(0 or 1 in this case)
		System.out.println(str.matches("[01]"));
		
		String hexa="234AB";
		System.out.println(hexa.matches("[0-9A-F]+"));
		
		String date="01/03/2000";
		System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
		
		//remove special characters using .replaceAll
		String sp="a!b@c$5%6^7&";
		System.out.println(sp.replaceAll("[^a-zA-Z0-9]", ""));
		
		//to remove extra spaces between words and trailing spaces
		String extSp="   sai charan  Amudala   ";
		System.out.println(extSp.replaceAll("\\s+", "").trim());
		
		//to count number of words present in a string seperated by spaces
		String sentence="    Amudala Sai Charan";
		sentence=sentence.replaceAll("\\s", " ").trim();
		System.out.println(sentence);
		String words[]=sentence.split(" ");
		System.out.println(words.length);
		

	}

}
