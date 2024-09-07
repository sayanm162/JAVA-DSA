//normal class and object creation
class Student {
    String name;
    int cls;

    void setNameCls(String name, int cls) {
        this.name = name;
        this.cls = cls;
    }

    void getNameCls() {
        System.out.println(this.name + " " + this.cls);
    }

}

// creating a class to initialize anonymous objects -> nameless object or
// objects without refernce variables
class Book {
    String name = "Maths";
    int cls = 10;

    void getInfo() {
        System.out.println(this.name + " " + this.cls);
    }
}

public class ObjectCreation {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setNameCls("Sayan", 4);
        s1.getNameCls();

        // anonymous object
        new Book().getInfo();

        // creating multiple objects by type one only
        Student s2 = new Student(), s3 = new Student();
        s2.setNameCls("Aditya", 5);
        s3.setNameCls("Manoj", 7);

        s2.getNameCls();
        s3.getNameCls();
    }
}
