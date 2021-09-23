package dataType;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

			return true;
		return false;

	}

	public boolean isAlphabate() {
		if (ch >= 97 && ch <= 122)
			return true;
		if (ch >= 65 && ch <= 90)
			return true;
		return false;

	}

	public boolean isConsonent() {
		// TODO Auto-generated method stub
		if (isAlphabate() && !isVowel())
			return true;
		return false;
	}

}
