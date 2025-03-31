package com.tcs;

public class RemovSpaces {
	String modify(String s) {
        // your code here
        return s.replaceAll(" ","");
}
	String modifyfn(String s) {
        // your code here
        // return s.replaceAll(" ","");
        StringBuilder kbuilder= new StringBuilder();
        for( char ch:s.toCharArray()){
            if(ch==' '){
                continue;
            }else{
                kbuilder.append(ch);
                
            }
        }
        return kbuilder.toString();
}
	 String modifyfunction(String s) {
	        // your code here
	        // return s.replaceAll(" ","");
	        StringBuilder kbuilder= new StringBuilder();
	        for( char ch:s.toCharArray()){
	            if(" ".indexOf(ch)!=-1){
	                continue;
	            }else{
	                kbuilder.append(ch);
	                
	            }
	        }
	        return kbuilder.toString();
	}
}
