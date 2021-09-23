package opps;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "green");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOf();

		System.out.println(fan);

	}

}
