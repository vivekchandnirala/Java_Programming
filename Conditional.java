import java.util.*;

public class Conditional {
    public static void main(String[] args){

        System.out.println("Now we are Using The Conditional Statement");

        //Taking Input From The User
        Scanner sc = new Scanner(System.in);
/*        int a = sc.nextInt();
        //Conditional Statement If and Else
        if(a%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
*/

        //Checking 3 Statements

        int a = sc.nextInt();  //Take Value of A
        int b = sc.nextInt();  // Take Value of B

        if(a==b){
            System.out.println("Equal");
        }
        else if (a>b) {
            System.out.println("A is Greater than B");
        }
        else{
            System.out.println("B is Greater than A");
        }
    }
}