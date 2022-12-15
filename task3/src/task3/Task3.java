//get the max of an array 
package task3;
 import java.util.Scanner;

public class Task3 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Scanner read = new Scanner(System.in); 
        System.out.println("enter number of elements in array"); 
        int x = input.nextInt(); 
        int[] arr = new int[x]; //declaration of an arary 
        System.out.println("enter the element"); 
        //intialize the values of the array by for loop 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("element " + (i + 1) + ": ");
            arr[i] = read.nextInt();

        }
         
        // print the array after the user eneter its elements 
        System.out.print("THE FINAL ARRAY IS :" + "(");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
            
            }
    
        int max = arr[0];
        //access element by element in the array and search the max of the array and print it
        for (int num :arr) {
            if (max < num) {
                max = num;
            }
        }
       System.out.println("Maxmum element = "+  max );// print the max of the array 
}
}
