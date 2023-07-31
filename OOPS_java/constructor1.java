public class constructor1 {
    public static void main(String args[]) {
        Student s2 = new Student();
        Student s3 = new Student("Sayan");
        Student s4 = new Student(27);
        Student s1 = new Student("Sayan Mitra", 27);
        
        s1.setPassword("abc");

        //initialzing marks
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        //demonstrating copy constructor
        Student s5 = new Student(s1);
        s5.setPassword("xyz");
        s1.marks[2] = 100;
        //value of S1.marks[2] is changed after creating a new object s5 using copy constructor with s1. normally after a copy
        //is created the change should not reflect in the new object which is a copy of another object but it happens

        System.out.println("for s1: \n" + s1.name + "\n" + s1.rollNo + "\n" + s1.getPassword());
        System.out.println("for s5: \n" + s5.name + "\n" + s5.rollNo + "\n" + s5.getPassword());
        
        for(int i=0; i<3; i++) {
            System.out.println(s5.marks[i]);
        }
        //change is also reflected in marks array in the new s5 object created with copy constructor using s1 object because 
        //s5 refer to the array of s1, no new  array is being created for s5. it simply refers to the array. Array in java
        //is passed by refernce. - this is a problem in copy consturctor
    }
}

 class Student {
     String name;
     int rollNo;
    private String password;
    int marks[];

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }


   //non-parametrized - default constructor
    Student() {
        marks = new int[3];
   // System.out.println("this a default, non parameterized constructor");
   }
   //parameterized constructor
    Student(String name, int rollNo) {
         marks = new int[3];
        this.name = name;
        this.rollNo = rollNo;
        //System.out.println("Constructor is called!/parametrized");
    }
    
    Student(String name) {
         marks = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
         marks = new int[3];
        this.rollNo = rollNo;
    }

    //copy constructor declaration  -> Shallow Copy Constructor
    Student(Student s1) {
        marks= new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }
}


