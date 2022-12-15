//get the transpose of a matrix 
package task5;
 import java.util.Scanner;
public class Task5 {

   
     public static void main(String[] args) {
        Scanner raw = new Scanner(System.in); 
        Scanner coulm = new Scanner(System.in); 
        Scanner input = new Scanner(System.in); 
        System.out.println("enter number of rows"); 
        int r = raw.nextInt(); // user enter the number of rows 
        System.out.println("enter number of coulms"); 
        int c = coulm.nextInt(); // user enter the number of coloums
        int[][] matrix = new int[r][c]; 
        //enter the values of the matrix
        for (int i = 0; i < r; i++) {
            System.out.println("enter the element in raw " + (i + 1) + " : ");
            for (int j = 0; j < c; j++) {
               matrix[i][j] = input.nextInt();
            }
        }

       //print the matrix before the transpose 
        System.out.println("the matrix is : {");
        for (int i = 0; i < r; i++) {
            for (int j= 0; j < c; j++) {
                System.out.print(matrix[i][j] + "  ");}
             System.out.println(" ");
             
        }
        System.out.println("}");
        System.out.println("transpose matrix is :");
        System.out.println("{");
        //get the transpose of a matrix 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[j][i] + "  ");} // get the transpose of a matrix by replacing coloums by rows and vice verse 
             System.out.println(" ");
        }
        System.out.println("}");

    }

    }
    

