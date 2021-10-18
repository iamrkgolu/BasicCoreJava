import java.util.*;
class NeonNumber{
public static void main(String... a){
Scanner s=new Scanner(System.in);
System.out.print("Enter Number: ");
int number=s.nextInt();
int squre=number*number;
int sum=0;
int number1;
while(squre!=0){
sum+=squre%10;
squre=squre/10;

}
if(sum==number){
	System.out.print("Neon");
	
}else{
	System.out.print("Not Neon");
}

}
}