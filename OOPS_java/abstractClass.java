public class abstractClass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); //default value is used by default

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color); //by default default value is used that is peach --- initializing variables for the child class
        c.changeColor();
        System.out.println(c.color);

        //Animal a = new Animal();  -> will give error since Animal is Abstract Class
    }
}

abstract class Animal {
//demonstrating constructor in abstract class
    String color;

    Animal() {
        this.color = "peach";
        System.out.println("Animal Constructor is called!");
    }

    void eat() {
        System.out.println("Animal eats!");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor is called!");
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }

    void changeColor() {
        this.color = "brown";
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor is called!");
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void changeColor() {
        this.color = "Yellow";
    }
}