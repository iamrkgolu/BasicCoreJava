package com.basicNumber.org;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=1;
	    int count=0;
		int i;
		if(number==0 || number==1|| number==2) {
			System.out.println("Not Valid");
		}else {
		for(i=3;i*i<=number/2;i++) {
			
			
		}
		if( number % i==0) {
			count++;
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
	}
	}
}
