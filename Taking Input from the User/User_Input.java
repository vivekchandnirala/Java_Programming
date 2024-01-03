import java.util.*;


public class User_Input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //This Line help to enable to Take input

        System.out.print("My Roll no. : ");
        int a = sc.nextInt();
        System.out.print("My name is : ");
        String b=sc.next();
        System.out.print("My Section is : ");
        String c = sc.next();
        System.out.print("My Percentage of Last Semester is : ");
        float d =sc.nextFloat();

        // All the Value Taken as input From the User
        // System.out.print();  <----    It is only Written for the Understanding

        // Now we Print All the Values, Those taken from the User


        System.out.print("My Roll No. :  ");
        System.out.println(a);
        System.out.print("My name is : ");
        System.out.println(b);
        System.out.print("My Section is : ");
        System.out.println(c);
        System.out.print("My Percentage of Last Semester is : ");
        System.out.println(d);


    }
}
