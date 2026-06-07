package qs;

import java.util.Scanner;

public class eigth {

    public static double power(int n , int x) {

        double result = 1;

          // Handle positive exponent
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        }
        // Handle negative exponent
        else if (n < 0) {
            for (int i = 1; i <= Math.abs(n); i++) {  //Math.abs(n) → n এর absolute value, অর্থাৎ n যদি negative হয়, তার positive equivalent নেবে।
                result *= x;
            }
            result = 1 / result;
        }
        // Handle zero exponent
        else {
            result = 1;
        }

        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter base x :");
        int n = sc.nextInt();
        System.out.println("enter exponent n :");
        int x = sc.nextInt();

       double ans = power(n, x);

       System.out.println(x + " raised to " + n + " = " + ans);
    }
}
