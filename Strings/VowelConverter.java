package Strings;

// Convert vowel character into _ if vowel count greater than 3.
import java.util.Scanner;

public class VowelConverter {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= scn.nextLine();
		int count=0;
		char[] ch=s.toCharArray();
			
		for(int i=0;i<ch.length;i++) {
				if(ch[i]=='A'||ch[i]=='E'|| ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')count++;
			}
			for(int i=0;i<ch.length;i++) {
				if(count>3) {
					if(ch[i]=='A'||ch[i]=='E'|| ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
						ch[i]='_';			
			}
		}
			System.out.println(ch);

	}

}
