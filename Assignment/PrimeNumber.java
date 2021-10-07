import java.util.*;
class PrimeNumber
{
public static void main(String... args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter Positive Non Zero Number: ");
int number=s.nextInt();
s.close();
int count=0;
for(int i=1;i<=number;i++){
if(number%i==0){
count++;
}}
if(count==2){
System.out.println(" Prime");
}else{
System.out.println(" Not Prime");


}
}
}