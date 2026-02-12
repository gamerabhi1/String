package Strings;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
		
		if (s1.length()!=s2.length())
			return false;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
				
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1=scn.next();
		System.out.println("Enter the 2nd String");
		String s2=scn.next();
		
		if(isAnagram(s1, s2))
		{
			System.out.println("both are anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
