package Strings;
import java.util.Scanner;
// program to print alphabet in given String

public class ExtractAlphabet {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter The String");
		String s=scn.next();
		String a="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')a+=s.charAt(i);
			else if (ch>='a' && ch<='z')a+=s.charAt(i);
		}
		System.out.println(a);	
	}

}
