import java.util.*;
   public class n{
        public static void main(String[] args) {
            int set = 1;
            int o_space;
            int o_star;
            while (set <= 3) {
                int nrow = 2;
                int space = 1;
                int star = 1;
                int row = 1;
                while (row <= nrow) {
                    for (int i = 1; i <= space; i++) System.out.print("\t");
                    for (int i = 1; i <= star; i++) System.out.print("*\t");
                    for (int i = 1; i < space; i++) System.out.print("\t");

                    System.out.println("");

                    space--;
                    star += 2;
                    row++;
                }
                set++;
                o_space = space;
                o_star = star;
            }
            for (int i = 1; i <= 1; i++) System.out.print("\t");
            for (int i = 1; i <= 1; i++) System.out.print("*\t");
            for (int i = 1; i < 1; i++) System.out.print("\t");


        }
    }


