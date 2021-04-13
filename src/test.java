import java.io.*;
public class test {
    public static void main( String[] args) {
            String[] result = "Stack Me 123 Heppa1 oeu".split("");

            // output should be
            // S
            // t
            // a
            // c
            // k
            // M
            // e
            // H
            // e
            // ...
            for ( int x=0; x<result.length; x++) {
                System.out.println(result[x] + "\n");
            }
        }
    }
