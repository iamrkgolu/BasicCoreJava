import java.util.*;
class DivideByThree{
public static void main(String... s){
Scanner src=new Scanner(System.in);
System.out.println("Enter Number :");
int number=src.nextInt();
int count=0;
while(number>0){
count++;
number=number-3;
}System.out.println(count);
}
}

