import java.util.Scanner;

public class Conditional_Statements_Else_If {
    public static void main(String[] args){

        //Question:- If user Press
        //1> Then Show Hello
        //2> Then show Namste
        //3> Then show Wow

        //Taking Input From the user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //Using If and Else and Else If statements

        if(a == 1)
            System.out.println("Hello");

        else if (a==2) {
            System.out.println("Namaste");
        }

        else if(a==3)
            System.out.println("Wow");

        else {
            System.out.println("Invalid");
        }
    }
}