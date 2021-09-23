package arrays;

public class ReverseString {

	private String reverse;

	public ReverseString(String reverse) {
		this.reverse=reverse;
	}

	public static void main(String[] args) {
		ReverseString reverse=new ReverseString("Hello");
		reverse.getReverse();
//		System.out.println(reverse);
	}

	private void getReverse() {
		char[] ch=reverse.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}

}
