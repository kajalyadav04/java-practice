package day_05;

public class CountTvTc {
	static int getVowelCount(String name) {
	    char[] arr=name.toCharArray();
	    int c=0;
	    int v=0;
	    for(int l=0;l<name.length();l++) {
	    	if(arr[l]=='a'||arr[l]=='e'||arr[l]=='i'||arr[l]=='o'||arr[l]=='u') {
	    		v++;
	    	}else {
	    		c++;
	    	}
	  }
	    return v;
	}
	  public static void main(String[] args) {
	    System.out.println("Total vowel in Rajesh is " + getVowelCount("Rajesh"));
	    System.out.println("Total vowel in Yogita is " + getVowelCount("Yogita"));
	  }
	}


