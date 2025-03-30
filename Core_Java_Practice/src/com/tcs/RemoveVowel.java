package com.tcs;

public class RemoveVowel {
	
	    String removeVowels(String s) {
	        // code here
	    //   s=s.toLowerCase();
	        // char[] ch=s.toCharArray();
	        StringBuilder k= new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	                    // if("aeiou".indexOf(ch[i])!=-1){
	            
	                continue;
	            }
	            else{
	                k.append(ch);
	            }
	            
	        }
	        return k.toString();
	    
	}

}
