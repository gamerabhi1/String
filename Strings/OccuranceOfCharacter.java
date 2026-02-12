package Strings;

import java.util.Scanner;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		int count=1;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			count=1;
			if(ch[i]=='\u0000')continue;	
		for(int j=i+1;j<ch.length;j++) {
			if(ch[j]==ch[i]) {
				count++;
			ch[j]='\u0000';
			}
		}
			System.out.println(ch[i]+"="+count);	
		}		
	}
}
