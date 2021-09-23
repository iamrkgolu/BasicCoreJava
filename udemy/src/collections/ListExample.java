package collections;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> animal=List.of("Elephant","Fox","Cat","Dog");
		animal.get(1);
		animal.contains("Apple");
		animal.size();
		animal.isEmpty();
		animal.indexOf("Cat");
		for(String animals:animal) {
			System.out.println(animals);
			
		}
	
	}

}
