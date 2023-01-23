package lab1pkg;

public class AbstractCat {
	//data fields
	private String name;
	private double age;//in years
	private Color color;//will be limited
	private String type;//(domestic/feral)
	static int numberOfCats;
	
	//Constructors
	public AbstractCat() {
	}
	
	public AbstractCat(String name, double age, Color color, String type) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAge() {
		return age;
	}
	
	public void setAge(double age) {
		this.age = age;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	//Custom classes
	public static int getNumberOfCats() {
		return numberOfCats;
	}
	public static void setNumberofCats(int numberOfCats) {
		AbstractCat.numberOfCats = numberOfCats;
	}
	
	//Custom methods
	String eat() {
		return "favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
	
	//toString
	//@Override
	/*public String toString() {
		return "AbstractCat [name =" + name + "age =" + age
				+ getName() + ", getAge()=" + getAge() + ", "
	}*/
	
}
