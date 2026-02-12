package Strings;

// Change consecutive character in $.
import java.util.Scanner;

public class ConsecutiveConvertor {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		char[]ch=s.toCharArray();
		String res="";
		
		for(int i=0;i<ch.length;i++) {
			if(i==0 || ch[i]!=ch[i-1]) {
				res+=ch[i];
				}
				else {
					if(res.charAt(res.length()-1)!='$') {
						ch[i]='$';
					}
					res+=ch[i];
			}
		}
		System.out.println(res);
	}
}
