import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String... s){
	Scanner src=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int number=src.nextInt();
	int squareOfNumber=number*number;
	int number1=number;
	int remNumber=0;
	int remSquare=0;
	int power=1;

	while(number1!=0){
	remNumber+=power*(number1%10);
	remSquare+=power*(squareOfNumber%10);
	 number1 =number1/10;
	squareOfNumber=squareOfNumber/10;
	power=power*10;
	
	} 
	if(remNumber==remSquare){
	System.out.print("Automorphics");
	}
	else{
	System.out.print("Not AutomorphicNumber");
	}
	}
	
}