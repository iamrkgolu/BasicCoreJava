package loop;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit=limit;
	}

	public static void main(String[] args) {
		WhileNumberPlayer player =new WhileNumberPlayer(30);
		player.printSqrt();
		
	}

	private void printSqrt() {
		int i=1;
		while(i*i<limit) {
			System.out.print(i*i +" ");
			i++;
		}
	}

}
