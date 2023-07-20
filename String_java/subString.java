public class subString {
    public static String printSubString(String str, int start, int end) {
        String subStr = ""; //initializing empty substring/string
        //traversing through the original string
        for(int i=start; i<end; i++) {
            subStr += str.charAt(i); //adding the character of the substring in the given limit
        }

        return subStr;
    }
    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(printSubString(str, 0, 4));

        //using inbuitl method
        System.out.println(str.substring(0, 4));
    }
}
