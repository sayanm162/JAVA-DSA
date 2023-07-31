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
    // Student(Student s1) {
    //     marks= new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    //deep constructor
    Student(Student s1) {
        marks = new int[3];
        this.rollNo = s1.rollNo;
        this.name = s1.name;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
        /*
         I will try to explain the difference between shallow and deep constructor in Java. A constructor is a special method that is used to initialize an object of a class. A copy constructor is a constructor that takes another object of the same class as a parameter and creates a copy of that object.

A shallow copy constructor creates a new object that shares the same references as the original object. This means that if the original object has any fields that are reference types, such as arrays or objects, then the new object will point to the same memory locations as the original object. Therefore, any changes made to the fields of one object will affect the other object as well.

A deep copy constructor creates a new object that has its own copies of the fields of the original object. This means that if the original object has any fields that are reference types, such as arrays or objects, then the new object will create new memory locations for those fields and copy their values from the original object. Therefore, any changes made to the fields of one object will not affect the other object.

In your code example, you have two versions of a copy constructor for a class called Student. The class has three fields: name, rollNo, and marks. The name and rollNo fields are primitive types, while the marks field is an array of integers.

The first version of the copy constructor is commented out and it is a shallow copy constructor. It creates a new Student object and assigns its name and rollNo fields to be the same as the original Student object. However, for the marks field, it simply assigns it to be equal to the marks field of the original Student object. This means that both objects will share the same array of marks in memory. If you change any element of the marks array in one object, it will also change in the other object.

The second version of the copy constructor is a deep copy constructor. It creates a new Student object and assigns its name and rollNo fields to be the same as the original Student object. However, for the marks field, it creates a new array of integers with the same length as the original marks array and copies each element from the original marks array to the new array. This means that both objects will have their own independent arrays of marks in memory. If you change any element of the marks array in one object, it will not affect the other object.

You can learn more about shallow and deep copy in Java from these web pages: [Shallow Copy vs Deep Copy in Java - Javatpoint](^1^), [Deep, Shallow and Lazy Copy with Java Examples - GeeksforGeeks](^2^).

Source: Conversation with Bing, 1/8/2023
(1) Shallow Copy vs Deep Copy in Java - Javatpoint. https://www.javatpoint.com/shallow-copy-vs-deep-copy-in-java.
(2) Deep, Shallow and Lazy Copy with Java Examples - GeeksforGeeks. https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/.
(3) Shallow Copy and Deep Copy in JavaScript - javatpoint. https://www.javatpoint.com/shallow-copy-and-deep-copy-in-javascript.
(4) What is shallow copy and deep copy in JavaScript - GeeksforGeeks. https://www.geeksforgeeks.org/what-is-shallow-copy-and-deep-copy-in-javascript/.
         */


    }
}


