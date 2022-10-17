package com.example.courses.controller;

public class Test {

	public static void main(String[] args) {
		String s = "aaaabccc";
		String res = compressString(s);
		System.out.println(res);
	}

	private static String compressString(String s) {
		
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i));
            int currCount = 1;
            
            while (s.charAt(i) == s.charAt(i + 1) && i != s.length() - 2) {
                currCount++;   
                i++;
            }
            
            if (currCount != 1) {
                sb.append(currCount);
            }
            
//            if (i == s.length() - 2 && s.charAt(i) == s.charAt(i + 1)) {
//            	sb.append(currCount + 2);
//            } else {
//            	sb.append(currCount + 1);
//            	sb.append(s.charAt(s.length() - 1));
//            }
        }
		return String.valueOf(sb);
    }
}
