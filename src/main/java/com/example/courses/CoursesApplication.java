package com.example.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
		System.out.println("Hello world!");
		
		String s = "aaaabccc";
		String res = compressString(s);
		System.out.println(res);
	}
	

	private static String compressString(String s) {
		
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i));
            int currCount = 1;
            
            while (s.charAt(i) == s.charAt(i + 1)) {
                currCount++;   
            }
            
            if (currCount != 1) {
                sb.append(currCount);
            }
        }
		return String.valueOf(sb);
    }
}
