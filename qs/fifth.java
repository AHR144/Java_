package qs;

import java.util.Scanner;

public class fifth {
    public static void eligible(int age) {
        if (age>18) {
            System.out.println("eligible for vote");
        }else  {
            System.out.println("not eligible for vote");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        
        eligible(age);
    }
}
