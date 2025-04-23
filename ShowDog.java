package edu.monmouth.assignment1;

public class ShowDog extends Dog {
	private String furColor;
	private String breed;

	public ShowDog(String furColor, String breed) {
		super(furColor);
		this.furColor = furColor;
		this.breed = breed;
	}


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void move() {
		System.out.println("The show dog is practicing its jumps for the next show.");
	}

	@Override
	public void makeSound() {
		System.out.println("Yip! Yip! Yap!");		
	}

	public String toString() {
		return "Show dog - fur color: " + furColor + " Breed: " + breed;

	}
}
