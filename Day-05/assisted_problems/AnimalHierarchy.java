//Q-1 Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
package assisted_problems;

//Create a class name Animal
class Animal{
    protected String name;
    protected int age;

    //Create a constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Create a method to make sound
    public void makeSound(){
        System.out.println("Animal Sound");
    }

    //Create a method to display the information
    public void displayInfo(){
        System.out.println("Name:" + name + " Age:" + age);
    }

}

//Create a class Dog extends properties of Animal
class Dog extends Animal{
    //Create a constructor
    public Dog(String name, int age){
        super(name, age);
    }
@Override
    //Display the information
    public void makeSound(){
        System.out.println("Sounds Bark");
    }
}

//Create a class Cat extends properties of Animal
class Cat extends Animal{
    //Create a constructor
    public Cat(String name, int age){
        super(name, age);
    }
@Override
    //Display the information
    public void makeSound(){
        System.out.println("Sounds Meow");
    }
}

//Create a class Bird extends properties of Animal
class Bird extends Animal{
    //Create a constructor
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    //Display the information
    public void makeSound(){
        System.out.println("Sound Chirp");
    }
}

class AnimalHierarchy{
    public static void main(String[] args) {

        //Create an object of Dog, Cat, Bird

        Dog dog = new Dog("German Shepherd", 10);
        Cat cat = new Cat("Persian", 7);
        Bird bird = new Bird("Parrot", 7);

        //Display the information
        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();

    }
}