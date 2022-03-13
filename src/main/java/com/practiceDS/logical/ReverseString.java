package com.practiceDS.logical;

public class ReverseString {
	public static void main(String[] args) {
		String original="I live in Bathinda";
		String reversed=reverseString(original);
		System.out.println(reversed);
	}


	private static String reverseString(String sentense)
    {
        if (sentense.isEmpty())
            return sentense;
 
        //Calling method Recursively
        return reverseString(sentense.substring(1)) + sentense.charAt(0);
    }

}
