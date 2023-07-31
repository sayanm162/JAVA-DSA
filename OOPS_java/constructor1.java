public class constructor1 {
    public static void main(String args[]) {
        Student s2 = new Student();
        Student s3 = new Student("Sayan");
        Student s4 = new Student(27);
        Student s1 = new Student("Sayan Mitra", 27);
    }
}

 class Student {
     String name;
     int rollNo;


   //non-parametrized - default constructor
   Student() {
    System.out.println("this a default, non parameterized constructor");
   }
   //parameterized constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Constructor is called!/parametrized");
    }
    
    Student(String name) {
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
}


