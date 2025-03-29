package com.tcs;

public class palindromeNum {
	
	    public boolean isPalindrome(int n) {
	        // Code here
	        int orgnum=n;
	        int rev=0;
	        while(n>0){
	            int rem=n%10;
	            rev=rev*10+rem;
	            n=n/10;
	        }
	        if(rev==orgnum){
	            return true;
	        }
	        return false;
	    }
	

}
