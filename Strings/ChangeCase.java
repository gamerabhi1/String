package Strings;
import java.util.Scanner;
public class ChangeCase {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		char[]ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]+=32;
			}else if(ch[i]>='a' && ch[i]<='z') 
				{
				ch[i]-=32;
				}
		}
		System.out.println("After changing the case");
		System.out.println(ch);
	}
}

