package Day9;

public class que2 {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
        dog.walk();
        dog.makeNoise();

        Animal cat=new Cat();
        cat.eat();
        cat.walk();
        cat.makeNoise();

        Animal tiger=new Tiger();
        tiger.eat();
        tiger.walk();
        tiger.makeNoise();
    }
}
class Animal{
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Barking....");
    }
}
class Cat extends Animal{
    public void makeNoise(){
        System.out.println("Meow........");
    }
}
class Tiger extends Animal{
    public void makeNoise(){
        System.out.println("Roar.......");
    }
}

