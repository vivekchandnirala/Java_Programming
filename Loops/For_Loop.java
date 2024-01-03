import java.util.Scanner;

public class For_Loop {
    public  static  void main(String[] args){

        //Question:- Print The User name 5 times

        //Taking Input From The User
        System.out.print("Enter Your Name : ");
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();


        //Using For Loop
        for(int i = 0; i < 5; i++){
            System.out.println(x);
        }

    }
}
