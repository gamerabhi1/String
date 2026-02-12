package Strings;

import java.util.Scanner;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= scn.nextLine();
		char[]ch= s.toCharArray();
		String res="";
		
		for(int i=0;i<ch.length;i++) {
			if (ch[i]!=' ' || (i>0 && ch[i-1]!=' ')) {
				res+=ch[i];
				
			}
		}
		System.out.println(res);
	}

}
