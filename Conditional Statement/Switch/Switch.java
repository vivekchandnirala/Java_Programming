import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        //Now we Going To Use Switch Statements
        //Question :-
        // when user click 1> Show Green
        //2> show Blue
        // 3> show Red
        //4> show Yellow


        //Taking Input From the User
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // Switch Statements

        switch(a){
            case 1:
                System.out.println("Green");
                break;

            case 2:
                System.out.println("Blue");
                break;

            case 3:
                System.out.println("Red");
                break;

            case 4:
                System.out.println("Yellow");
                break;

            default:
                System.out.println("Invalid Value You have Entered");
        }
    }
}
