class CopyConstructor{
int x;
int y;
CopyConstructor(int x,int y){
this.x=x;
this.y=y;
}
void show(){
System.out.println(x);
System.out.println(y);
}
CopyConstructor(CopyConstructor z){
this.x=z.x;
this.y=z.y;
}
public static void main(String... args){
CopyConstructor c=new CopyConstructor(10,20);
c.show();
CopyConstructor c1=new CopyConstructor(c);
c1.show();
}
}