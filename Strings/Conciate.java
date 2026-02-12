package Strings;

public class Conciate {
	    public static void main(String[] args){
	        String s1="Abhishek Kumar Singh";
	        String s2="Sunil Kumar Singh";
	        String s11="";
	        String s22="";
	        for(int i=s1.length()-1;i>=0;i--){
	            if(s1.charAt(i)==' ')
	            {
	                s11+=s1.substring(0, i);
	                break;
	            }
	        }
	        for(int j=s2.length()-1;j>=0;j--){
	            if(s2.charAt(j)==' '){
	                s22+=s2.substring(0, j);
	                break;
	            }
	        }
	        System.out.println(s11+" "+s22);
	    }
}