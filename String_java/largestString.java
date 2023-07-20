//printing the largest string among a given set of string based on its length
public class largestString {
    public static String getLargestString(String str1, String str2, String str3) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        if(len1>len2 && len2>len3) {
            return str1;
        }
        else if(len2>len3 && len3>len1) {
            return str2;
        }

        return str3;
        }

    

    public static void main(String[] args) {
        String s1 = "apple", s2 = "mango", s3 = "banana";
        System.out.println(getLargestString(s1, s2, s3));

    }
}
