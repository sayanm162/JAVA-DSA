import java.util.*;

public class strongNo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the No.: ");
    int num = sc.nextInt();

    if(checkStrong(num)) {
        System.out.println("Strong No");
    }

    else {
        System.out.println("Not strong no");
    }

    sc.close();

}

public static int fact(int num) {
    
    int fac = 1;
    for(int i=1; i<=num; i++) {
        fac*= i;
    }

    return fac;
}

public static boolean checkStrong(int num) {
    int sum = 0;
    int temp = num;

    while(temp != 0) {
        int rem = temp % 10;
        sum = sum + fact(rem);
        temp /= 10;
    }

    if(num == sum) {
        return true;
    }

    return false;
}

}