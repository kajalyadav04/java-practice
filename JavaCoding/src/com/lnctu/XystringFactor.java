package com.lnctu;
import java.util.*;
public class XystringFactor {
	    public static String findMinStringFactor(String X, String Y, int S, int R) {
	        int n = X.length();
	        int m = Y.length();
	        String revY = new StringBuilder(Y).reverse().toString();

	        int[] dp = new int[n + 1];
	        Arrays.fill(dp, Integer.MAX_VALUE);
	        dp[0] = 0; 
	        for (int i = 0; i < n; i++) {
	            for (int len = 1; len <= m && i + len <= n; len++) {
	                String subX = X.substring(i, i + len);
	                
	                if (Y.contains(subX)) {
	                    dp[i + len] = Math.min(dp[i + len], dp[i] + S);
	                }
	                
	                if (revY.contains(subX)) {
	                    dp[i + len] = Math.min(dp[i + len], dp[i] + R);
	                }
	            }
	        }	     
	        if (dp[n] == Integer.MAX_VALUE) {
	            return "Impossible";
	        }

	        return String.valueOf(dp[n]);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        String X = sc.nextLine();
	        String Y = sc.nextLine();
	       
	        int S = sc.nextInt();
	        int R = sc.nextInt();
	        
	        System.out.print(findMinStringFactor(X, Y, S, R));
	        sc.close();
	    }
	}


