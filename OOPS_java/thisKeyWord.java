public class thisKeyWord {
    public static void main(String args[]) {
        Sayan s = new Sayan(27, "Mitra", "IT",4000, 'A' );
        s.display();
        s.dis();
        Student.dis();
        Sayan.dis();
    }
}

//consturctor chaining- application of this to invoke current class constructor
class Student {
    int rollNo;
    String name, course;
    char section;
    static int reg;
    
    
    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        
        

    }

    Student(int rollNo, String name, String course, char section) {
        this(rollNo, name, course);
        this.section = section;
        System.out.println(this.reg);
    }

    static void dis() {
        System.out.println("Hi" + reg);
        
    }

  
}

class Sayan extends Student{
    float fee;
    
    Sayan(int rollNo, String name, String course, float fee, char section){
        super(rollNo, name, course, section);
        this.fee = fee;
    }
     void display() {
        System.out.println(this.rollNo + " " + this.name + " " + this.course + " " + this.fee  + " " + this.section);
     }

}
