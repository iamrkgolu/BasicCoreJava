package com.pattern.org;

public class TrianglePatternExample2 {
	public static void main(String[] args) {
		
	
	int n=5;
	int str=1;
	int spc=n-1;
	for(int i=1;i<=n;i++) {
//		System.out.println(spc+""+str);
		for(int j=1;j<=spc;j++) {
			System.out.print(" ");
		} 
		for(int k=1;k<=str;k++) {
			System.out.print("*");
		}
		
		str++;
		spc--;
		System.out.println();
	}
	
	
	}
}
