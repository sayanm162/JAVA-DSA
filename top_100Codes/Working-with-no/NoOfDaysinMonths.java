
/*Java Program to count the no of days in a month */
import java.util.*;

public class NoOfDaysinMonths {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Month No: (1-Jan, 2-Feb, 3-Mar, 4-Apr, 5-May, 6-June, 7-July, 8-Aug, 9-Sept, 10-Oct, 11-Nov, 12-Dec");
        int no = sc.nextInt();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        System.out.println(noOfDays(no, year));

        sc.close();
    }

    public static int noOfDays(int monthNo, int year) {
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (monthNo == 2 && ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))) { // leap year condition
            return month[monthNo - 1] + 1;
        }

        return month[monthNo - 1];
    }
}