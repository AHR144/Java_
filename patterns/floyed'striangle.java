

import java.util.*;

public class one{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int number = sc.nextInt();

       for (int i = 1; i <=x; i++) {

        for (int j = 1; j <=i; j++) {
            System.out.print(number + " ");
            number++;//number=number+1
        }
        System.out.println();
       }

       
      

    }
}