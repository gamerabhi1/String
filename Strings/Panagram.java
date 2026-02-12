package Strings;

public class Panagram {
	public static boolean isPanagram(String s2) {
		if(s2.length()<26) {
		return false;
	}
		s2=s2.toLowerCase();
		String s1="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(!s2.contains(String.valueOf(ch))) {
				return false;
		}
	}
	return true;
}
	
	public static void main(String[] args) {
		String s2="a quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s2));
	}
}