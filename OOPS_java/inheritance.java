public class inheritance {
    public static void main(String args[]) {
        //single level inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // shark.swim();
        // shark.breathe();

        //multilevel inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.breathe();
        // dobby.legs = 4;
        // dobby.breed = "Husky";
        // System.out.println(dobby.legs);

        //hierarchial inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();
        // shark.swim();

        // Mammal human = new Mammal();
        // human.eat();
        // human.breathe();
        // human.walk();

        // Bird crow = new Bird();
        // crow.eat();
        // crow.breathe();
        // crow.fly();
    }
}

//single level inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("Eats!");
    }

    void breathe() {
        System.out.println("Breathes!");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

//multilevel inheritance
class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Mammal {
    String breed;
}


//heirarchial inheritance
class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}
