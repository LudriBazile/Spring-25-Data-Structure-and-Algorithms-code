package edu.monmouth.assignment1;

public class Dog implements Animal {
	private String furColor;
	
	
	
	public Dog(String furColor) {
		this.furColor = furColor;
	}

	public void setFurColor(String color) {
		furColor = color;
	}
	
	public String getFurColor() {
		return furColor;
	}
	
	@Override
	public void move() {
		 System.out.println("The dog walks around the park.");
	}

	@Override
	public void makeSound() {
		System.out.println("Bark! Bark! Bark!");		
	}
	
	public String toString() {
		return "Dog - fur color: " + furColor;	
	}
}

