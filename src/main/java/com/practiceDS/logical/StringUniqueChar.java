package com.practiceDS.logical;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueChar {
	public static void main(String[] args) {
		String str="Nokiaa";
		System.out.println("Duplicate character avaliable : "+byHashset(str));
		System.out.println("Duplicate character avaliable : "+byStringOperation(str));
	}
	private static boolean byHashset(String str) {
		Set<String> set=new HashSet<String>();
		for(String s:str.split("")) {
			if(!set.add(s))
				return true;
		}
		return false;		
	}
	private static boolean byStringOperation(String str) {
		for(String st:str.split("")) {
			if(str.indexOf(st)!=str.lastIndexOf(st))
				return true;
		}
		return false;
	}
}
