import java.util.Scanner;

public class Ascii {
    public static void main(String args[]){
        System.out.println("I am vaishali - 18MIS0082 ");
        System.out.println("This is a sample program");
        Scanner scn= new Scanner(System.in);
        String x =scn.next();
        char c =x.charAt(0);
        int value=(int)c;
        System.out.println(value);


    }
}
