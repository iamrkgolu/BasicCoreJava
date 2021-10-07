class ConstructorChaining{
ConstructorChaining(){
 this(10);
 System.out.println("Default");
}
ConstructorChaining(int x){
this(10,20);
System.out.println(x);
}
ConstructorChaining(int x,int y){
System.out.println(x+y);
}
public static void main(String... args){
  new ConstructorChaining();
}
}