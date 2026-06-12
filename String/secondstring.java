package String;

import java.util.*;

public class secondstring {
    public static void main(String[] args) {
        
    
    //concatination
    String firstname = "Tony";
    String secondname = "stark";

    String fullname = firstname + secondname ;
    System.out.println(fullname.length());
    //charAt

    for (int i = 0;i < fullname.length();i++){
        System.out.println(fullname.charAt(i));
        
    }

    }
}