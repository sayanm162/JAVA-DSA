public class Polymorphism {
    public static void main(String args[]) {
       Calculator cal = new Calculator();
       System.out.println(cal.sum(2,3));
       System.out.println(cal.sum(4.5f, 1.0f));
       System.out.println(cal.sum(2,3,6));


       Deer deer1 = new Deer();
       deer1.eat();
    }
}
//demonstrating compile time polymorphism/method overloading/static polymorphism
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

//demonstrating Method Overriding/Run time polymorphism/Dynamic Polymorphism
class Animal {
    void eat() {
        System.out.println("Eats everything!");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass!");
    }
}
