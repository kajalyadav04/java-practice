package com.tcs;

public class vowelConsonentCount {
	static void checkString(String s)
    {  
        s=s.toLowerCase();
        
        int v=0;
        int c=0;
        
        //Your code here
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else{
                c++;
            }
            }
            
        }
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }

}
