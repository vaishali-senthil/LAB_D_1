import java.util.Scanner;

public class Record {
    public static void main(String args[]){
        System.out.println("I am vaishali - 18MIS0082 ");
        System.out.println("This is a sample program");

        Student student1 = new Student();
        Student student2 = new Student();
        student1.insert("vaishali",180082L);
        student2.insert("akila",1800833L);
        student1.display();
        student2.display();
    }
}
class Student{
    //Scanner scn= new Scanner(System.in);
    String name ;
    Long regno ;

    void insert(String n,Long r){
        name=n;
        regno=r;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("regno:"+regno);
    }


    }

