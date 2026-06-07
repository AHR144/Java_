package qs;

import java.util.Scanner;

public class fourth {
    public static double radius(int r,double pi) {
        return 2*pi*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        double pi = 3.1416;

        System.out.println(radius(r, pi));
    }
}
