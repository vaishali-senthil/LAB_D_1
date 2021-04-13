public class Squareroot {
    public static void main(String args[]){
        System.out.println("I am vaishali - 18MIS0082 ");
        System.out.println("This is a sample program");
        double a=1,b=8,c=5;
        double sqrt1,sqrt2;
        sqrt1 = (- b+Math.pow(((Math.pow(b,2)-4 * a * c)),0.5))/2 * a;
        sqrt2 = (- b-Math.pow(((Math.pow(b,2)-4 * a * c)),0.5))/2 * a;

        System.out.print(sqrt1+ "\n" + sqrt2);
        //System.out.print(sqrt2);//

    }
}
