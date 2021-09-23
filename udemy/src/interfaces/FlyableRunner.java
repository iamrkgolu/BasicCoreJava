package interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable{

@Override
public void fly() {
	System.out.println("with wings");
	
}
}
class Aeroplane implements Flyable{

@Override
public void fly() {
	System.out.println("with fule");
	
}
}
public class FlyableRunner{
	public static void main(String[] args) {
		Flyable[] flyingObjects= {new Bird(),new Aeroplane()};
		for(Flyable objects:flyingObjects) {
			objects.fly();
		}
	}
}