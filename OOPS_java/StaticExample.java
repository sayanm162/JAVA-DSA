//Example demonstrating the use of static keyword
public class StaticExample {
    public static void main(String args[]) {
        School student1 = new School("Sayan", 27);
        School student2 = new School("Aditya", 22);
        student1.schoolName = "GNIT";

        System.out.println(student1.name + " " + student1.rollNo + " " + student1.schoolName);
        System.out.println(student2.name + " "  + student2.schoolName);
    }
}

class School {
    String name;
    int rollNo;
    static String schoolName;
    //static variables are created in the memory only once and all the object refer to the same static variable
    //upon its creation instead of creating its own copies every time

    /*School(String name, int rollNo, String schoolName){
        this.name = name;
        this.rollNo = rollNo;
        this.schoolName = schoolName;
    }
    */

    School(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    

}