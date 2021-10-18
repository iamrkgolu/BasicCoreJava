import java.util.*;
class CompositeNumber{
public static void main(String... a){
Scanner s=new Scanner(System.in);
System.out.print("Enter Number: ");
int number=s.nextInt();
int count=0;
for(int i=1;i<=number;i++){
	if(number% i ==0){
		count++;
	}
}
if(count==2){
	System.out.print("Not Composite Number");
	
}else{
	System.out.print("Composite Number");
}

}
}