package FunctiosMythod;

import java.util.Scanner;

public class multiply2nums {
    public static int multiplyof2nums(int a,int b) {
        
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        
        System.out.println("multiplication of two numbers :"+multiplyof2nums(a, b));
    }
}
