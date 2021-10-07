import java.util.*;
class Hcf{

 static int hcf=0;
public static void main(String... s){
Scanner src=new Scanner(System.in);
System.out.println("Enter First Number");
int number1=src.nextInt();
System.out.println("Enter Second Number");
int number2=src.nextInt();
src.close();
if(number1>number2){
	int hcf=number1%number2;
	System.out.println("The H.C.F of "+ number1 +" and "+ number2 +" is " + hcf);
}else if(number1==number2){
	int hcf=number1/number2;
	System.out.println("The H.C.F of "+ number1 +" and "+ number2 +" is " + hcf);
}else{
	int hcf=number2%number1;
 System.out.println("The H.C.F of "+ number2 +" and "+ number1 +" is " + hcf);
}

}
}