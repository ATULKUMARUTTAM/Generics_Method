import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        List<Student> LS =  new ArrayList<>();

        System.out.println("Enter the total number of Students ");
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        for(int i=0;i<n ;i++)
        {
            System.out.println("Enter age ");
            int age = sc.nextInt();
            System.out.println("Enter Name ");
            String name = sc.next();
            Student s = new Student(age,name);
            LS.add(s);
        }

        List<Employee> LE =  new ArrayList<>();

        System.out.println("Enter the total number of Employee ");
        //Scanner sc =  new Scanner(System.in);
         n =  sc.nextInt();
        for(int i=0;i<n ;i++)
        {
            System.out.println("Enter age ");
            int age = sc.nextInt();
            System.out.println("Enter Name ");
            String name = sc.next();
            Employee e = new Employee(age,name);
            LE.add(e);
        }

        List<Integer> LI = new ArrayList<>();
        LI.add(12);
        LI.add(30);
        LI.add(40);


        display(LS);
        display(LE);
        display(LI);
    }
    //Generic method
    public static <T> void display(List<T> LG)
    {
        System.out.println("Your Data ");
        for(T i: LG)
        System.out.println(i);
    }


}