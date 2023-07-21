//Finding out the largest string for the given set of strings lexicographically
public class largestStringLexicographically {

    public static String getLargest(String str[]) {
        //assuming the first string is the largest
        String largest = str[0];
        //traversing through the array of strings
        for(int i=1; i<str.length; i++) {
            if(largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    } 
    public static void main(String args[]) {
        String fruits[] = {"apple", "mango", "banana"};
        System.out.println(getLargest(fruits)); 

        
    }
}
