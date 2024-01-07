import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args){

        //Command for Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter The Number of Column : ");
        int cols = sc.nextInt();

        //Declaration of 2D Arrays
        int matrix[][] = new int[rows][cols];

        //Taking Input from the user for the Matrix
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //Display the Output
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
