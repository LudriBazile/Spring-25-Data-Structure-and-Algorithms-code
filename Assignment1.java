package edu.monmouth.assignment1;

import java.util.Arrays;

public class Assignment1 {
    final static int ARRAY_SIZE = 10;
    private static int count = 0;
    private static Animal[] zoo; 
    private static int numDog = 0;
	private static int COPY_ARRAY_SIZE = 3; 
  

    public static void main(String[] args) {
        // Initialize zoo array
        zoo = fillZoo();
        
        System.out.println("Before switch"); 
        System.out.println();
        System.out.println("Do While loop");
        System.out.println();

        do {
            System.out.println(zoo[count].toString());
            zoo[count].move();
            zoo[count].makeSound();
            count++;
            System.out.println();
            
        } while (count < ARRAY_SIZE);
       
        System.out.println();
        System.out.println("For loop");
        System.out.println();

        for (int i = 0; i < ARRAY_SIZE; i++) { 
            System.out.println(zoo[i].toString());
            zoo[i].move(); 
            zoo[i].makeSound();
            System.out.println();
        }
        
        System.out.println();
        System.out.println("While loop");
        System.out.println();
        
        count = 0;
        while (count < ARRAY_SIZE) {
            System.out.println(zoo[count].toString()); 
            zoo[count].move();
            zoo[count].makeSound(); 
            count++;
            System.out.println();
        }

        Animal anotherZoo[] = swap(2, 4);

        System.out.println();
        System.out.println("After switch");
        System.out.println();
        

        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(anotherZoo[i].toString());
            anotherZoo[i].move();
            anotherZoo[i].makeSound();
            System.out.println();
        }

        // Corrected call to findDogs
        Animal dogsOnly[] = findDogs(zoo);

        System.out.println("\nDogs Only Array:");
        System.out.println();
        for (int i = 0; i < numDog; i++) {
            System.out.println(dogsOnly[i].toString());
            dogsOnly[i].move();
            dogsOnly[i].makeSound();
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Copy of Array");
        System.out.println();
        
       Animal copy[] = Arrays.copyOf(zoo,COPY_ARRAY_SIZE);
       
       for (int i = 0; i < COPY_ARRAY_SIZE; i++) {
           System.out.println(copy[i].toString());
           copy[i].move();
           copy[i].makeSound();
           System.out.println();
       }
    }

    
    private static Animal[] findDogs(Animal[] zoo) {
        int numDogs = 0;
        int position = 0;
        
        for (Animal zooAnimals : zoo) {
            if (zooAnimals instanceof Dog) {
                numDogs++;
            }
        }
        numDog = numDogs; 
        Animal[] dogsOnly = new Animal[numDogs];

        
        for (Animal zooAnimals : zoo) {
            if (zooAnimals instanceof Dog) {
                dogsOnly[position] = zooAnimals;
                position++;
            }
        }

        return dogsOnly;
    }

    private static Animal[] swap(int index1, int index2) {
       Animal[] secondZoo = Arrays.copyOf(zoo, ARRAY_SIZE);
    	
    	Animal temp = secondZoo[index1];
    	secondZoo[index1] = secondZoo[index2];
    	secondZoo[index2] = temp;

        return secondZoo;
    }

    private static Animal[] fillZoo() {
        Animal[] buildArray = new Animal[ARRAY_SIZE];

        buildArray[0] = new Dog("Brown");
        buildArray[1] = new Dog("Black");
        buildArray[2] = new GuardDog("Tan", (short) 123);
        buildArray[3] = new GuardDog("Black", (short) 3513);
        buildArray[4] = new ShowDog("Black", "Corgi");
        buildArray[5] = new ShowDog("Black", "Corgi");
        buildArray[6] = new ShowDog("Brown", "Pug");
        buildArray[7] = new ShowDog("Tan", "Pug");
        buildArray[8] = new Fish("Red");
        buildArray[9] = new Fish("Blue");

        return buildArray; 
    }
}
