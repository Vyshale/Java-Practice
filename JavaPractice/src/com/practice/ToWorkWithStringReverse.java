package com.practice;

public class ToWorkWithStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Vyshale";
		String s1= "";
		
		for(int i = s.length()-1;i>=0;i--)
		{
			s1 = s1+ s.charAt(i);
			 //System.out.print(s1);
		}
         System.out.print(s1);
	}

}
