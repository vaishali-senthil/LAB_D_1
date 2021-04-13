import java.util.*;
public class Main {
    public  static  void  main(String args[]){
        System.out.println("I am vaishali - 18MIS0082 ");
        System.out.println("This is a sample program");

        Scanner scn = new Scanner(System.in);
        String in = scn.next();
        char n = in.charAt(0);
        n = Character.toLowerCase(n);
        //boolean flag = false;//it's not a vowel
        boolean flag = (n == 'a') || (n == 'e') || ( n== 'i') || ( n== 'o') || (n == 'u');

        if(flag) // it is a vowel
            System.out.println("Vowel");
        else
            System.out.println("Not a Vowel");

    }
}
