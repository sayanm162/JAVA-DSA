//For a given string convert each letter of the first word into upper case
public class StringQ1 {

    public static String getUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            /*If the current character is a space and there is at least one more character after it, the space is appended to the StringBuilder object and the next character is converted to uppercase using the Character.toUpperCase method and then appended to the StringBuilder object. */
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        } 
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String s = "hi! i am Say n        ";
        System.out.println(getUpperCase(s));
    }
}
