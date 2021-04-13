import java.util.*;
    public class Students{
        public static void main(String args[]){
            System.out.println("I am vaishali - 18MIS0082 ");
            System.out.println("This is a sample program");


            System.out.println("Enter the details of student");
            Scanner sc = new Scanner(System.in);

            System.out.println("regno:");
            String regno= sc.nextLine();

            System.out.println("name:");
            String name=sc.nextLine();


            System.out.println("phoneno:");
            long phoneno= sc.nextLong();

            System.out.println("regno:"+regno);
            System.out.println("name:"+name);
            System.out.println("phoneno:"+phoneno);
        }

    }


