package lab1pkg;
enum Color {
	WHITE, CREAM, CINNAMON, CHOCOLATE
}

public class Cat {
	String name;
	double age;//age in years
	Color color;//we will limit color choice
	String type;//(domestic/feral)
	static int numberOfCats;
	
	//Constructors
	public Cat(){}
	public Cat(String name) {
		this.name = name;
	}
	Cat(String name, double age, Color color, String type) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
	}
	Cat(String name, String breed) {
		this.name = name;
		System.out.println(breed);
	}
	
	//Custom methods
	public static int getNumberOfCats() {
		return numberOfCats;
	}
	
	String eat() {
		return "favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
}

// test commit commenteee