package Strings;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.nextLine();
		//String s="java is easy";
		System.out.println(rev(s));
		}
	public static String rev(String s) {
		int i=0;
		int j=0;
		String s2=" ";

		while(j<s.length()) {
			while(j<s.length() && s.charAt(j)!=' ')
				j++;
			int k=j-1;
			while(k>=i) {
				s2+=s.charAt(k);
				k--;
			}
			
			if(j<s.length())
				s2+=" ";
				j++;
				i=j;
			}
		return s2;
	}
}

	

