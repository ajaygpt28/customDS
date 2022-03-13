package com.practiceDS.logical;


//Two string are anagrams if they have same characters but in different order. 
//For example: Angel and Angle are anagrams

public class AnagramStrings {
	public static void main(String[] args) {
		String word="Angel";
		String anagram="elgna";
		System.out.println(anagramCheck(word, anagram));
	}
	private static boolean anagramCheck(String word,String anagram) {
		word=word.toLowerCase();
		anagram=anagram.toLowerCase();
		if(word.length()!=anagram.length())
			return false;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			int index=anagram.indexOf(ch);
			
			if(index==-1)
				return false;
			anagram=anagram.substring(0,index)+anagram.substring(index+1);
		}
		return anagram.isEmpty();
	}
}
