package Strings;

public class KeywordSenCount {
	
	public static void main(String[] args) {
		String keyWord = "patanjali";
		String[] sentences = {
				"Patanjali is the best brand",
	            "I like ashirvad ata",
	            "Taste of patanjali is better than ashirvad",
	            "Patanjali is not certified"
	        };
	     int count = 0;
	     for (String sentence : sentences) {
	        	
	if (sentence.toLowerCase().contains(keyWord.toLowerCase()))
	{
	    count++;
	    }
	    }
	        System.out.println(count);
	    }
	}
