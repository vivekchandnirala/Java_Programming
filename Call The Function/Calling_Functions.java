import java.util.Scanner;
//Hum User se input lenge main Class meh Par usko Print hum dusre Class se karwayege
//Main class se wo wale call ko call kiya jayega

public class Calling_Functions {

                  //Yeh wala class Call hoga
                  public static void printMyName(String name){
                      System.out.println("Welcome ! \nYou are in the Another Class ");
                      System.out.println("Your Input is : "+name);
                      //Last meh Yeh jarur Likhna
                      return;
                  }
 //--------------------------------------------------------------------------------------------------------------
    //Yeh main class hai (Bole tho jo Sabse Phele Excute hoga)
    public static void main(String[] args){
        System.out.print("Enter Your Name : ");
        //Taking Input From The User
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();

        //Ab Function ko call karege
        printMyName(name);
    }
}
