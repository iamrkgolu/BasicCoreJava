import java.util.Scanner;
public class HarshadNumber {
	public static void main(String... s){
	Scanner src=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int number=src.nextInt();
	int number1=number;
	int sum=0;
	while(number!=0){
	sum+=number%10;
	number=number/10;
	}
	
	if(number1%sum==0){
		System.out.println("HarshadNumber");
	}else{
		System.out.println("Not HarshadNumber");
	}
	}
	}