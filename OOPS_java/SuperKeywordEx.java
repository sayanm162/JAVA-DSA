public class SuperKeywordEx {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
        Animal a = new Animal();
        System.out.println(a.color);
    }
}

class Animal {
     String color = "peach";  //static 
    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        super.color = "brown";
        //java invokes super() by default even if it is not explicitly invoked in the child class
        System.out.println("Horse Constructor is called");
    }
}
