package com.tcs;

public class palindromeString {
	public boolean isPalindrome(String s) {
	       
        String k = s.toLowerCase().replaceAll("[^a-z0-9]", "");

 
         if(k.isEmpty()){
            return true;
        }
        // k=s.replaceAll(":","");
        StringBuilder a= new StringBuilder();
        char[] b=k.toCharArray();
        
        for(int i=b.length-1;i>=0;i--){
             a.append(k.charAt(i));
        }
        return k.equals(a.toString());
          
    }
	public boolean isPalindromeUsingInbuildfn(String s) {
	       
        String k = s.toLowerCase().replaceAll("[^a-z0-9]", "");

 
         if(k.isEmpty()){
            return true;
        }
        // k=s.replaceAll(":","");
        StringBuilder a= new StringBuilder(k).reverse();
        
        return k.equals(a.toString());
          
    }
}
	

