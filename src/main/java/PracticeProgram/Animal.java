package PracticeProgram;

public class Animal {
        String name;
        int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void makeSound() {
            System.out.println("Animal makes a sound.");
        }

        void eat() {
            System.out.println(name + " is eating.");
        }
    }

    class Dog extends Animal {
        String breed;

        Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        @Override
        void makeSound() {
            System.out.println(name + " barks!");
        }
    }

    class Cat extends Animal {
        boolean isIndoorCat;

        Cat(String name, int age, boolean isIndoorCat) {
            super(name, age);
            this.isIndoorCat = isIndoorCat;
        }

        @Override
        void makeSound() {
            System.out.println(name + " meows!");
        }
    }

     class Main {
        public static void main(String[] args) {

            Animal genericAnimal = new Animal("Generic Animal", 5);
            Dog buddy = new Dog("Buddy", 3, "Golden Retriever");
            Cat whiskers = new Cat("Tom", 2, true);

            genericAnimal.makeSound();
            genericAnimal.eat();

            buddy.makeSound();
            buddy.eat();

            whiskers.makeSound();
            whiskers.eat();
        }
}


