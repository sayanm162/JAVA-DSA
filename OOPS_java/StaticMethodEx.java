public class StaticMethodEx {
    public static void main(String args[]) {
        Student s1 = new Student(27, "Sayan");
        Student s2 = new Student(22, "Aditya");
        Student s3 = new Student(26, "Raka");

        s1.display();
        s2.display();
        s3.display();

    }
}

class Student {
    int rollNo;
    String name;
    static String schoolName="GNIT";

    //static method to change the value of static variable
    static void changeSchool(String newName) {
        schoolName = newName;
    }

    //constructor to initialize the variable (instance variables)
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    //method to display the values
    void display() {
        System.out.println("Roll No: " + this.rollNo + " Name: " + this.name + " School: " + schoolName);
    }
}
