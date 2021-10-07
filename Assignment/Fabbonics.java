class Factorial{
public static void main(String... args){
int number1=0;
int number2=1;
int temp =number1+number2;
System.out.print(number1+" ");
System.out.print(number2+" ");
for(int i=1;i<=10;i++){
temp=number1+number2;
System.out.print(" "+temp);
number1=number2;
number2=temp;
number2=temp;
}
}
}