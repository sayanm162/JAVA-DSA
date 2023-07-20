

public class basicString {
    public static void main(String[] args) {
        //various methods of declaring strings in Java
        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        String str = "Hello";  //using string literal
        String str_new = new String("Hello!"); //creating string object using new keywords and constructor

        //equal() method -> to compare string content for 2 strings
        //== relational operator to compare to object references
        String s1 = "Hello"; /* Lies in the common string pool all referring to the same string object */
        String s2 = "Hello";
        String s3 = s1;

        String s4 = new String("Hello"); /*Lies in heap, referring to different individual string objects */
        String s5 = new String("Hello");
        String s6 = new String(s1);

        //System.out.println(s1.equals(s6));
        System.out.println(s1==s6);

        // System.out.println(s1==s2);
        // System.out.println(s2 == s3);
        // System.out.println(s1 == s1);
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s3));
        // System.out.println(s1 == s4);
        // System.out.println(s1.equals(s4));
        // System.out.println(s4 == s5);
        // System.out.println(s4.equals(s5));

        //accessing elements in the array
        String firstName = "Sayan";
        String LastName = "Mitra";
        String fullName = firstName + " " + LastName;
        accessChars(fullName);


    }

    //function to access elements in string
    public static void accessChars(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
