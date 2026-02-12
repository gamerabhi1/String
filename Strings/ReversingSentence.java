package Strings;
import java.util.Scanner;

public class ReversingSentence {

//	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter the sentence");
//		String s=scn.nextLine();
//		System.out.println("Rev string is");
//		System.out.println(rev(s));
//	}
//	public static String rev(String s) {
//		int i=s.length()-1;
//		int j=s.length()-1;
//		String s2="";
//		
//		while(i>=0) {
//		while(i>=0 && s.charAt(i)!=' '){
//			i--;
//		}
//			int k=i+1;
//			while(k<=j)
//			{
//				s2+=s.charAt(k);
//				k++;
//			}
//			if(i>=0)
//				s2+=" ";
//			i--;
//			j=i;
//		}
//		return s2;
//	}
//}
		public static void main(String[] args) {
			       
		 String sentence="i am vivek";
	        String[] words = sentence.split(" ");{			        for (int i = words.length - 1; i >= 0; i--) {
			  System.out.print(words[i] + " ");
			}
		    }
		}
	}
	

