package com.tcs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Asciifn {
	public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        // char[]  ch=name.toCharArray();
                      // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        char k=name.charAt(0);
        int res=asciifn(k);
        System.out.println(res);
    }
    public static int asciifn(char b){
        int k=(int) b;
        return k;

    }

}
