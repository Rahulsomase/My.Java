package Overriding;

//Defination and usage od super :-

//The super keyword refers to superclass (parent) objects.

//        It is used to call superclass methods, and to access the superclass constructor.
//        The most common use of the super keyword is to eliminate the confusion between superclasses and
//        subclasses that have methods with the same name.

public class que2 {
    public static void main(String args[]) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object
    }
}

class Animal { // Superclass (parent)
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal { // Subclass (child)
    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }
}




