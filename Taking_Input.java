import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        //Taking Input from the user

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   //Taking The Value of A from The User
        int b = sc.nextInt();   //Taking The Value of B from The User

        int sum = a+b;

        System.out.print("The sum of Input A and Input B  ");
        System.out.println(sum);
    }
}
