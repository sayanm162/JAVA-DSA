public class inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.breathe();
    }
}

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
