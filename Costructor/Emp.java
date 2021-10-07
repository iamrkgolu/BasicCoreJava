class Emp{
int salary;
String name="Rahul";
static String cname="Tcs";
Emp(int salary){
this.salary=salary;
System.out.println(salary);
}
public static void main(String... args){
Emp e1=new Emp(15000);
System.out.println(e1.name);
System.out.println(cname);
}
}