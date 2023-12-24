import java.util.*;

//Write a program when you Click 1> print Hello
// When you click 2> print Nameste
//When you click 3> print Kaise ho
public class SwitchCondition {
    public static void main(String[] args){

        //Taking Input from User
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Kaise ho");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

    }
}
