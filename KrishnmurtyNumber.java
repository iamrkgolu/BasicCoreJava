import java.util.Scanner;
public class KrishnmurtyNumber {
	public static void main(String... s){
	Scanner src=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int number=src.nextInt();
	int number1=number;
	int factsum=1;
	int sum=0;
	while(number!=0){
	int rem=number%10;
	for(int i=1;i<=rem;i++){
		factsum=sum*1;
	}
	 sum+=factsum;
	
	number=number/10;
	}
	
	if(sum==number1){
		System.out.println("KrishnmurtyNumber");
	}else{
		System.out.println("Not KrishnmurtyNumber");
	}
	}
	}