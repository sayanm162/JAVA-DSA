import java.util.*;
public class dailyPracitce {


  public static boolean checkPalindrome(int num) {
      int temp = num;
      int revNum = 0;
      while(temp!=0) {
        int rem = temp%10;
        revNum = revNum*10 + rem;
        temp /= 10;

      }

      return num == revNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(checkPalindrome(num));

    sc.close();
  }
}