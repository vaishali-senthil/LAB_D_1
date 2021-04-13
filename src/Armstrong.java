/* sample 1*/
public class Armstrong{
        public static void main(String args[]){
            System.out.println("I am vaishali - 18MIS0082 ");
            System.out.println("This is a sample program");

            int n,n1,n2,n3,n4,n5;

            n=153;
            int temp = n;
            int count = 0;
            while(n>0){
                int last = n%10;
                n/=10;
                double pow_last =  Math.pow(last, 3);
                count+=pow_last;
            }
            if (count == temp)
                System.out.println("Amstrong");
            else
                System.out.println("Not a Amstrong");

            /*n1= n/10;
            System.out.println(n1);
            n2= n%10;
            System.out.println(n2);
            n3=n1/10;
            System.out.println(n3);
            n4=n1%10;
            System.out.println(n4);
            n5=(n4*n4*n4)+(n3*n3*n3)+(n2*n2*n2);
            System.out.println(n5);
            if(n==n5)
            {
                System.out.println("It is armstrong number");
            }
            else
            {
                System.out.println("not armstrong");
            }

             */

        }
    }

