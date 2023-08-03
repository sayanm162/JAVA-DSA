public class practice3 {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.legs = 4;
        System.out.println(a.name + " " +  a.legs);
        Human h = new Human();
       // h.changeName("Sapiens");
      
       // h.name = "Homo Sapiens";
        System.out.println(h.name + " " + h.legs);

    }

}

class Animal {
     
    Animal() {
        
        System.out.println("Animal Constructor is called!");
    }
    String name = "Animals";
    int legs;
    Animal(int x) {
        this();
    }
    

    void categoryOf() {
        
        System.out.println("Normal Animal" + this.legs);
        
    }
}

class Human extends Animal {

    // static void changeName(String newName) {   //this/super cannot be used in static method
    //     this.name = newName;   
    // 
  
  void changeName(String newName) {
        name = newName;
    }

   
  
    Human() {
        System.out.println("Human Constructor called!");
        //.name = "Homo Sapien";
        super.legs = 2;
    }
     int hands;
   

    void cat() {
        
        System.out.println("God's Creation");
    }
}