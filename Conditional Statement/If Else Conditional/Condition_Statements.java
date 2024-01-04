import java.util.*;

public class Condition_Statements {
    public static void main(String[] args) {

        //Question Take no. from the user and tell that is divisible  of 2 or not

        //Input from the user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // Using If and Else Condition

        if (a % 2 == 0) {
            System.out.println("It is a Even Number");
        } else {
            System.out.println("It is a Odd Number");
        }

    }
}


