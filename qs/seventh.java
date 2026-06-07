package qs;

import java.util.Scanner;

public class seventh {

    public static void figureout( int positive ,int negative ,int zeros ) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        char choice;
        do {
            System.out.println("enter a number:"+a);
            
            if (a>0) {
                positive++;
            }else if(a<0){
                negative++;
            }else{
                zeros++;
            }

            System.out.println("do you wanna continue?(y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nPositive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);

        sc.close(); //extra 
    }
    public static void main(String[] args) {
        
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        figureout(positive, negative, zeros);
    }
}
