package Strings;
import java.util.Iterator;
import java.util.Scanner;

public class ToCharArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
