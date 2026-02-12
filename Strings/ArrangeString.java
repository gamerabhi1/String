package Strings;
import java.util.Scanner;
// Arrange the Character in format

public class ArrangeString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s= scn.next();
		String uc="";
		String lc="";
		String num="";
		String sc="";
		
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')uc+=s.charAt(i);
		else if (ch>='a' && ch<='z')lc+=s.charAt(i);
		else if (ch>='0' && ch<='9')num+=s.charAt(i);
			else { sc+=s.charAt(i);
		}
		}
		System.out.println();
		System.out.println("The Order of String is");
		System.out.println();
		System.out.println(num+sc+lc+uc);
		}
}