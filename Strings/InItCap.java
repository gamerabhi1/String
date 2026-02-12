package Strings;
import java.util.Scanner;

public class InItCap {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		char[]ch=s.toCharArray();
			
		for(int i=0;i<ch.length;i++) {
			if(i==0 || ch[i-1]==' ') {
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]-=32;
				}
			}
		}
			System.out.println(ch);
		
	}
}

