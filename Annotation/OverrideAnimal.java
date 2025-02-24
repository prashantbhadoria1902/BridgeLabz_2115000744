class Animal {
    void makeSound(){
        System.out.println("Animal make sound...");
    }
}

class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("Dog make Sound...");
    }
}
public class OverrideAnimal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}