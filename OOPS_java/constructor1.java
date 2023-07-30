public class constructor1 {
    public static void main(String args[]) {
        Student s1 = new Student("Sayan Mitra", 27);
        System.out.println(s1.name + " " + s1.rollNo);
    }
}

 class Student {
   public String name;
   public int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Constructor is called!");
    }
}
