/*Write a code to change all zero's as one's (0s as 1s) in a given number? ex: 120014 needs to be printed as 121114
 */

 import java.util.*;

 public class ZeroTo1Replace{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(replace(num));
    sc.close();

  }

  public static int replace(int num) {
    Integer temp = num;
    String original = temp.toString();
    String newStr = "";

    for(int i=0; i<original.length(); i++) {
      if(original.charAt(i) == '0') {
        newStr = newStr + "1";
      }
      else{
        newStr = newStr + original.charAt(i);
      }
    }
    int newNum = Integer.parseInt(newStr);
    return newNum;
  }
 }

