public class StringBuilderEx {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hi");

        //appending new characters in the end of the stringbuilder
        /*The time complexity of this code is O(n), where n is the number of characters being appended to the StringBuilder object. This is because the for loop runs n times, and each append operation takes constant time. */
        for(char ch='a'; ch<='z'; ch++ ) {
            sb.append(ch); //+= not available in stringBuilder
            
        }
        System.out.println(sb.substring(0, 4));

        //using string
        String str = new String();
        str = "hi";
        /*The time complexity of the code is O(n^2), where n is the number of characters being appended to the String object. This is because the += operator creates a new String object every time it is used, which takes O(n) time. Since the loop runs n times, the total time complexity of the code is O(n^2) */
         for(char ch='a'; ch<='z'; ch++ ) {
            str += ch;  //append not available in String
            
        }
        System.out.print(str);

        // int a = (int)'a';
        // System.out.println(a);

        
    }
}
