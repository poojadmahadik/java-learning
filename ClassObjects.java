// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 
class Dog extends Animal{
    void bark() {
        System.out.println("Barking...");
    }
}
//main class
public class ClassObjects {
    public static void main(String[] args){

        Dog dog = new Dog();

        dog.eat();
        dog.bark();

    }
}
