package Strings;

import java.util.Scanner;

public class MaxCountOccurance {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		int maxCount=0;
		char maxChar=' ';
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
		if(ch[i]=='\u0000')continue;
		
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='\u0000';
			}
		}
		if(count>maxCount) {
			maxCount=count;
			maxChar=ch[i];
		}
		System.out.println(ch[i]+"="+count);
		}
		System.out.println("================");
		System.out.println(maxChar+"="+maxCount);
	}
}
