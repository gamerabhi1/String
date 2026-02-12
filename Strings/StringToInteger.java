package Strings;
import java.util.Scanner;
// convert String to Integer without using ParseInt Method

public class StringToInteger {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String-Number");
		String s=scn.next();
		int m=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			m=m*10+(ch-'0');
			}
		System.out.println(m);
	}
}
