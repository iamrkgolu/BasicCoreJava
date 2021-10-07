import java.util.*;
class Mobike
{
	String bikeNumber;
	String name;
	int days;
	
	void input(String s1,String s2,int s3)
	{
		bikeNumber=s1;
		name=s2;
		days=s3;
	}
	
	void display()
	{
		
		System.out.println(bikeNumber);
		System.out.println(name);
		System.out.println(days);
		
	}
	void compute(){
		if(days<=5){
			int charge=days*500;
			System.out.println(charge);
		}else if(days>5 && days<=10){
			int days1=days-5;
			int charge=days1*400+(2500);
			System.out.println(charge);
		}else{
			int days1=days-10;
		
			int charge=days1*200+(2500+2000);
			System.out.println("Charge of"+ days + "is : " + charge);
		}
	}
	public static void main(String... args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Bike Number :");
		String bikeNumber=s.nextLine();
		System.out.print("Enter Name :");
		String name=s.nextLine();
		System.out.print("Enter Days :");
		int days=s.nextInt();
		s.close();
		Mobike mobike=new Mobike();
		mobike.input(bikeNumber ,name,days);
		mobike.display();
		mobike.compute();
		
	}
}