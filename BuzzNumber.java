import java.util.Scanner;
public class BuzzNumber {
	public static void main(String... s){
	Scanner src=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int number=src.nextInt();
	if(number%7==0 || number%10==7){
		System.out.println("Buzz Number");
	}else{
		System.out.println("Not Buzz Number");
	}
	}
	}