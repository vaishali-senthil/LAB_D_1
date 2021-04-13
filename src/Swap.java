import java.util.*;
public class Swap {
    public static void main(String args[]){
        System.out.println("I am vaishali - 18MIS0082 ");
        System.out.println("This is a sample program");
        //with temp variable
        int x=9;
        int y=10;
        int temp;

        temp=x;
        x=y;
        y=temp;
        System.out.println("x="+x);
        System.out.println("y="+y);
        //without temp variable

        int a=9;
        int b=10;

        a=a+b;
        b= a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}
