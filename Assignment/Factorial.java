import java.util.*;
class Factorial{
public static void main(String... s){
	Scanner src=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int number=src.nextInt();
	int sum=1;
	for(int i=1;i<=number;i++){
		sum=sum*i;
		
	}System.out.println(sum);
	
}


}