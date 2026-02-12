package Strings;
import java.util.Scanner;
// Find the vowel character in the given string

public class VowelDetector {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=scn.next();
		int count=0;
		
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')count++;
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')count++;
			}
			System.out.println(count);
				
		}
}
