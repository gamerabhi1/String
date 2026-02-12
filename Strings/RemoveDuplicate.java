package Strings;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		String result=" ";
		
		char[] ch=s.toCharArray();
	
		for(int i=0;i<ch.length;i++) {
		if(ch[i]=='\u0000')continue;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) 
			{
			ch[j]='\u0000';
			}
			result+=ch[i];
			}
		}
		System.out.println(ch);
	}

}
