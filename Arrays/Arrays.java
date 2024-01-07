public class Array {
    public static void main(String[] args){

/*
   1st Method of Declaring the Arrays

       //We are Declaring Array and the size of Array
        int[] marks = new int[3];
        // Now we are Declaring the Value
        marks[0]=97;
        marks[1]=87;
        marks[2]=99;
*/

 // 2nd Method of Declaring the Arrays

 int[] marks = {84,96,85,74,99};

        // Now we Print the Values Of array through For Loop
        for (int i=0;i<5;i++){
            System.out.println("Marks are "+marks[i]);
        }

    }
}
