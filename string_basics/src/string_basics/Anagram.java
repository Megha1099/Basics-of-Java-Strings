package string_basics;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="game";
		String s2="megg";
		if(s1.length()!=s2.length())
		{
			System.out.println("not a anagram cuz length");
		}
		else
		{
			ana(s1,s2);
			
		}
	}
	static void ana(String s1, String s2)
	{
		char []c1=s1.toCharArray();
		char []c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("both are anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}
	
	}

}
