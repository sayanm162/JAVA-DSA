public class abstractClass {
    public static void main(String args[]) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color); //default value is used by default

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color); //by default default value is used that is peach --- initializing variables for the child class
        // c.changeColor();
        // System.out.println(c.color);

        //Animal a = new Animal();  -> will give error since Animal is Abstract Class
        //Animal --> Horse --> Mustang
        Mustang mustang1 = new Mustang();
        mustang1.eat();
        mustang1.walk();
        System.out.println(mustang1.color); //default color
        mustang1.changeColor();
        System.out.println(mustang1.color);


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

    abstract void walk();  // gives the idea of method to its child classes not the implementation of the method
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

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor is called");
    }

    void changeColor() {
        this.color = "Oxford White";
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